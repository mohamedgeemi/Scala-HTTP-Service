package models

import play.api.libs.json.Json
import play.api.libs.functional.syntax._
import play.api.libs.json._

case class Resturant(uuid: String, data: Data)

object Resturant {
  implicit val resturantFormat = Json.format[Resturant]
}

//object Resturant {
//  implicit val ResturantWrites: Writes[Resturant] = (
//    (JsPath \ "uuid").write[String] and
//      (JsPath \ "data").write[Data]
//    )(unlift(Resturant.unapply))
//}