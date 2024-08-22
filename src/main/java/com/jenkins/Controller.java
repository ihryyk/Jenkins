package com.jenkins;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("jenkins")
public class Controller {

    @GetMapping
    String getHelloWorld(){
        return "Hello world from jenkins";
    }

}
