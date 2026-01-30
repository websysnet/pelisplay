package com.websysnet.pelisplay.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String Saludar(){
        return "Hola mundo";
    }


}
