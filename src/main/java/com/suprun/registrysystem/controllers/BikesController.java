package com.suprun.registrysystem.controllers;

import com.suprun.registrysystem.models.Bike;
import com.suprun.registrysystem.services.BikeService;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    private BikeService bikeService;

    @GetMapping
    public List<Bike> getBikes(){
        return bikeService.getBikes();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public void create(@RequestBody Bike bike){
        bikeService.create(bike);
    }

    @GetMapping("/{id}")
    public Bike get(@PathVariable("id") long id){
        return bikeService.get(id);
    }
}
