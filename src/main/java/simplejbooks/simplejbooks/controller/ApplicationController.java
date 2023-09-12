package simplejbooks.simplejbooks.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class ApplicationController {

    @RequestMapping("/")
    public String index() {

        return "/application/index";
    }
}