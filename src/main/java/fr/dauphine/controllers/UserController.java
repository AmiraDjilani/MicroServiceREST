package fr.dauphine.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @RequestMapping(value="/user", method= RequestMethod.GET)
    public String listeProduits() {
        return "Un exemple de produit";
    }
}

