package tim.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MvcPageControll {

    @RequestMapping("/")
    public String welcomePage(){
        return "welcome.html";
    }

    @GetMapping("/home")
    public String homePage(){
        return "home.html";
    }

}
