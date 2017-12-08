package controllers

import play.api._
import play.api.libs.json._
import play.api.mvc._
import play.api.libs.concurrent.Execution.Implicits.defaultContext
import play.modules.reactivemongo.MongoController
import play.modules.reactivemongo.json.collection.JSONCollection
import play.api.libs.json.Json

import reactivemongo.api.Cursor

import scala.concurrent.{Future}

import models._

object Application extends Controller with MongoController{

  def collection: JSONCollection = db.collection[JSONCollection]("resturant")

  // Application Index
  def index = Action {
    Ok("elmenus Resturants REST API task")
  }

  // Listing all the resturants
  def getRestaurants = Action.async {
    val cursor: Cursor[Resturant] = collection.find(Json.obj()).cursor[Resturant]
    val futureResturantsList: Future[List[Resturant]] = cursor.collect[List]()
    val futureRestaurantsJsonArray: Future[JsArray] = futureResturantsList.map { restaurants =>
      Json.arr(restaurants)
    }
    futureRestaurantsJsonArray.map { posts=>
      Ok(posts)
    }
  }

  // Adding new restaurants to MongoDB
  def addRestaurant = Action.async(parse.json) { request =>
    request.body.validate[Resturant].map { restaurant =>
      collection.insert(restaurant).map { Error =>
        Logger.debug(s"Successfully inserted to Database with Error: $Error")
        Ok(Json.obj("result" -> "Data was inserted Successfully into MongoDB"))
      }
    }.getOrElse(Future.successful(BadRequest("Bad Request")))
  }

  // Get a specific restaurant with uuid
  def getResturant(uuid: String) = Action.async {
    val cursor: Cursor[Resturant] = collection.
      find(Json.obj("uuid" -> uuid)).cursor[Resturant]
    val futureRestaurantsList: Future[List[Resturant]] = cursor.collect[List]()
    val futureRestaurantsJsonArray: Future[JsArray] = futureRestaurantsList.map { restaurants =>
      Json.arr(restaurants)
    }
    futureRestaurantsJsonArray.map { restaurants=>
      Ok(restaurants)
    }
  }

//  def updateRestaurant(uuid: String) = Action { request =>
//    val selector = BSONDocument("uuid" -> uuid)
//
//    val modifier = BSONDocument(
//      "$set" -> BSONDocument(
//        "enName" -> "Mohamed",
//        "arName" -> "Gamal"),
//      "$unset" -> BSONDocument("enName" -> 1))
//
//  
//    val futureUpdate1 = personColl.update(selector, modifier)
//  }


//  def filterRestaurants(closed: Option[String]) = Action {
//       Ok(closed)
//  }
}