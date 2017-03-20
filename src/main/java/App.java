import java.util.HashMap;
import java.util.Map;

import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;

import static spark.Spark.*;

public class App {
  public static void main(String[] args) {
    String layout = "templates/layout.vtl";

    get("/", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/form.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/response", (request, response) -> {
      ChangeMachine newMachine = new ChangeMachine();
      String changeString = newMachine.makeChange(Float.parseFloat(request.queryParams("dollar")));
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("change", changeString);
      model.put("template", "templates/response.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());


  }
}
