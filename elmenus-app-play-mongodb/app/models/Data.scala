package models

import play.api.libs.json.Json


case class Data(enName: String, arName: String, state: String, routingMethod: String, logo: String,coverPhoto: String,
                enDescription: String, arDescription: String, shortNumber: String, facebookLink:String,
                twitterLink: String, youtubeLink: String, website: String, onlinePayment: Boolean, client: Boolean,
                pendingInfo: Boolean, pendingMenu: Boolean, closed: Boolean)

object Data {
  implicit val dataFormat = Json.format[Data]
}