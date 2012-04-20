package controllers;

//import play.*;
import json.DisplayResults;
import play.mvc.*;

import views.html.*;
import views.html.index;

public class Application extends Controller {

  public static Result index() {
      return ok(views.html.index.render());
  }

  public static Result display() {
      DisplayResults results = new DisplayResults();
      String content = results.returnContent();
      return ok(views.html.display.render(content));
  }

}