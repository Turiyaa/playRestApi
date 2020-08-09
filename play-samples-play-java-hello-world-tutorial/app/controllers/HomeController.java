package controllers;
import com.fasterxml.jackson.databind.JsonNode;
import play.libs.Json;
import play.mvc.*;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */
    public Result index() {
        return ok(views.html.index.render());
    }

    public Result explore() {
        return ok(views.html.explore.render());
    }

    public Result tutorial() {
        return ok(views.html.tutorial.render());
    }

    public Result hello(String name) {
      return ok(views.html.hello.render(name));
    }

    public Result Students(){
      DummyData data = new DummyData();
      data.createData();
      JsonNode personJson = Json.toJson(DummyData.list);
      return ok(personJson);
    }

    public Result getStudentById(int id){
      DummyData data = new DummyData();
      data.createData();
      Student student = data.getStudentById(id);
      JsonNode personJson = Json.toJson(student);
      return ok(personJson);
    }
}
