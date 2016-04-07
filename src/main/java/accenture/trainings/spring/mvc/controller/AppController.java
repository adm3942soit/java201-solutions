package accenture.trainings.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class AppController
{

    @RequestMapping("/welcome")
    public ModelAndView helloWorld() {

        String message = "<br><div  style='text-align:center;'>"
                + "<h1>********** Hello World, Spring MVC Tutorial **********</h1></div><br><br>";
        return new ModelAndView("welcome", "message", message);
    }
    @RequestMapping("/index")
    public ModelAndView index() {

        return new ModelAndView("index");
    }
}