package tim.app.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestResponseController {

    @GetMapping("/rest")
    String[] listFolder(){
        return new FileDriver().listNames("C:/Users/tim0f/Downloads/");
    }
}
