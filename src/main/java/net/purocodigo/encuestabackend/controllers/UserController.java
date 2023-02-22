package net.purocodigo.encuestabackend.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.PostMapping;


@RestController
@RequestMapping("/users")
public class UserController {
    
    @PostMapping
    public String createUser() {
        
        return "Hola mundo";
    }
    

}
