package com.example.designPatterns.controller;

import com.example.designPatterns.builder.Contact;
import com.example.designPatterns.factory.Pet;
import com.example.designPatterns.factory.PetFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {
    private final PetFactory   petFactory;


    public AppController(PetFactory petFactory){
        this.petFactory = petFactory;
    }
    @PostMapping("/adoptPet/{type}/{name}")
    public Pet adoptPet(@PathVariable String type, @PathVariable String name){
        Pet pet = petFactory.createPet(type);
        pet.setName(name);
        return pet;
    }

    @PostMapping("contact")
    public Contact createContact(@RequestParam(required = false)String firstName ,
                                 @RequestParam(required = false)String lastName,
                                 @RequestParam(required = false) String emailAddress){
        return Contact.ContactBuilder
                .getInstance()
                .setFirstName(firstName)
                .setEmailAddress(emailAddress)
                .setLastName(lastName).build();

    }

}
