package priv.lint.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class hello {
    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }
}
