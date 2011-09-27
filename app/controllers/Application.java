package controllers;

import play.mvc.*;

public class Application extends Controller {

    public static void index() {
        String ip = request.remoteAddress;
        render(ip);
    }

}