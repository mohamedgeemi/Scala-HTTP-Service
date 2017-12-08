// @SOURCE:E:/Tasks/elmenus/Delieverables/elmenus-app-play-mongodb/conf/routes
// @HASH:c4fec1077213b6017d0643a7a5439ab13591bd7b
// @DATE:Fri Dec 08 22:51:10 EET 2017


import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset

import Router.queryString

object Routes extends Router.Routes {

import ReverseRouteContext.empty

private var _prefix = "/"

def setPrefix(prefix: String) {
  _prefix = prefix
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" }


// @LINE:6
private[this] lazy val controllers_Application_index0_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
private[this] lazy val controllers_Application_index0_invoker = createInvoker(
controllers.Application.index,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "index", Nil,"GET", """ Home page""", Routes.prefix + """"""))
        

// @LINE:9
private[this] lazy val controllers_Application_getRestaurants1_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("api/restaurant"))))
private[this] lazy val controllers_Application_getRestaurants1_invoker = createInvoker(
controllers.Application.getRestaurants,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "getRestaurants", Nil,"GET", """ Rest API""", Routes.prefix + """api/restaurant"""))
        

// @LINE:10
private[this] lazy val controllers_Application_addRestaurant2_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("api/restaurant"))))
private[this] lazy val controllers_Application_addRestaurant2_invoker = createInvoker(
controllers.Application.addRestaurant,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "addRestaurant", Nil,"POST", """""", Routes.prefix + """api/restaurant"""))
        
def documentation = List(("""GET""", prefix,"""controllers.Application.index"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """api/restaurant""","""controllers.Application.getRestaurants"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """api/restaurant""","""controllers.Application.addRestaurant""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]]
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:6
case controllers_Application_index0_route(params) => {
   call { 
        controllers_Application_index0_invoker.call(controllers.Application.index)
   }
}
        

// @LINE:9
case controllers_Application_getRestaurants1_route(params) => {
   call { 
        controllers_Application_getRestaurants1_invoker.call(controllers.Application.getRestaurants)
   }
}
        

// @LINE:10
case controllers_Application_addRestaurant2_route(params) => {
   call { 
        controllers_Application_addRestaurant2_invoker.call(controllers.Application.addRestaurant)
   }
}
        
}

}
     