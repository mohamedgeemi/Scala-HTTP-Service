// @SOURCE:E:/Tasks/elmenus/Delieverables/elmenus-app-play-mongodb/conf/routes
// @HASH:c4fec1077213b6017d0643a7a5439ab13591bd7b
// @DATE:Fri Dec 08 22:51:10 EET 2017

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset

import Router.queryString


// @LINE:10
// @LINE:9
// @LINE:6
package controllers {

// @LINE:10
// @LINE:9
// @LINE:6
class ReverseApplication {


// @LINE:10
def addRestaurant(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "api/restaurant")
}
                        

// @LINE:6
def index(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix)
}
                        

// @LINE:9
def getRestaurants(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "api/restaurant")
}
                        

}
                          
}
                  


// @LINE:10
// @LINE:9
// @LINE:6
package controllers.javascript {
import ReverseRouteContext.empty

// @LINE:10
// @LINE:9
// @LINE:6
class ReverseApplication {


// @LINE:10
def addRestaurant : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.addRestaurant",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "api/restaurant"})
      }
   """
)
                        

// @LINE:6
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        

// @LINE:9
def getRestaurants : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.getRestaurants",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/restaurant"})
      }
   """
)
                        

}
              
}
        


// @LINE:10
// @LINE:9
// @LINE:6
package controllers.ref {


// @LINE:10
// @LINE:9
// @LINE:6
class ReverseApplication {


// @LINE:10
def addRestaurant(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.addRestaurant(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "addRestaurant", Seq(), "POST", """""", _prefix + """api/restaurant""")
)
                      

// @LINE:6
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "index", Seq(), "GET", """ Home page""", _prefix + """""")
)
                      

// @LINE:9
def getRestaurants(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.getRestaurants(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "getRestaurants", Seq(), "GET", """ Rest API""", _prefix + """api/restaurant""")
)
                      

}
                          
}
        
    