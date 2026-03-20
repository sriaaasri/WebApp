package com.hanuman.webapp.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app")
public class AppController {

    @GetMapping()
    @ResponseBody
    public String welcomeMessage(){
        return "Welcome to webapp";
    }

    @GetMapping("/deploy")
    public ResponseEntity<String> testController(){
        return ResponseEntity.ok("This is webapp if your are seeing this message means application deployment is successful -- Happy coding!!");

    }

    


}
