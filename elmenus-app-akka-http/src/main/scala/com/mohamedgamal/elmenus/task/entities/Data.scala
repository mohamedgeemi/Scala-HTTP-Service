package com.mohamedgamal.elmenus.task.entities

case class Data (enName: String, arName: String, state: String, routingMethod: String, logo: String,coverPhoto: String,
                 enDescription: String, arDescription: String, shortNumber: String, facebookLink:String,
                 twitterLink: String, youtubeLink: String, website: String, onlinePayment: Boolean, client: Boolean,
                 pendingInfo: Boolean, pendingMenu: Boolean, closed: Boolean)
