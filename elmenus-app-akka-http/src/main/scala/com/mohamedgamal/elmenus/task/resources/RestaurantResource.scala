package com.mohamedgamal.elmenus.task.resources

import akka.http.scaladsl.server.Route

import com.mohamedgamal.elmenus.task.entities.{Restaurant, DataUpdate}
import com.mohamedgamal.elmenus.task.routing.MyResource
import com.mohamedgamal.elmenus.task.services.RestaurantService


trait RestaurantResource extends MyResource {

  val restaurantService: RestaurantService = new RestaurantService()

  def restaurantRoutes: Route = pathPrefix("api") {

    pathPrefix("restaurant") {
      pathEnd {
        post {
          entity(as[Restaurant]) { restaurant =>
            restaurant.uuid = java.util.UUID.randomUUID().toString()
            completeWithLocationHeader(
              resourceId = restaurantService.createRestaurant(restaurant),
              ifDefinedStatus = 201, ifEmptyStatus = 409)
          }
        }~get{
          parameter("closed"?) { query =>
            complete(restaurantService.getRestaurants(query.getOrElse("")))
          }
        }
      } ~
        path(Segment) { uuid =>
          get {
            complete(restaurantService.getRestaurant(uuid))
          } ~
            put {
              entity(as[DataUpdate]) { update =>
                complete(restaurantService.updateRestaurant(uuid, update))
              }
            }
        }
    }
  }

}
