package com.suprun.registrysystem.controllers;

import com.suprun.registrysystem.models.Bike;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/bikes")
public class BikesController {

    @GetMapping
    public List<Bike> getBikes(){

    }

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public void create(@RequestBody Bike bike){

    }

    @GetMapping("/{id}")
    public Bike get(@PathVariable("id") long id){
        return new Bike();
    }
}
