package com.mohamedgamal.elmenus.task

import scala.concurrent.ExecutionContext

import akka.http.scaladsl.server.Route

import com.mohamedgamal.elmenus.task.resources.RestaurantResource
import com.mohamedgamal.elmenus.task.services.RestaurantService

trait RestInterface extends Resources {

  implicit def executionContext: ExecutionContext

  lazy val resturantService = new RestaurantService()

  val routes: Route = restaurantRoutes

}

trait Resources extends RestaurantResource

