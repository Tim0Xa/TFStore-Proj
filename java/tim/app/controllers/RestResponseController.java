package tim.app.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestResponseController {

//    @GetMapping("/rest")
//    String[] listFolder(){
//        return new FileDriver().listNames("C:/Users/tim0f/Downloads/");
//    }

    @PostMapping("/rest")
    String[] listFolder (@RequestBody String addr) {
        addr = addr.replace("%3A",":")
                .replace("%2F","/");
        addr =  addr.substring(0, addr.length() - 1);
        System.out.println(addr);
        return new FileDriver().listNames(addr);
    }
}
