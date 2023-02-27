
package com.backendportfolio.controller;

import org.springframework.web.bind.annotation.*;


@RestController
public class Controller {
    
    
    @GetMapping("/")
    public String saludo(){
        return "Hola mundo!";
    }
}
