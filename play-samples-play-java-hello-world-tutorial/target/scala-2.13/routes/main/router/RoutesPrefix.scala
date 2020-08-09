// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/narayan/Documents/GitHub/play-samples-play-java-hello-world-tutorial/conf/routes
// @DATE:Sat Aug 08 18:13:09 EDT 2020


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
