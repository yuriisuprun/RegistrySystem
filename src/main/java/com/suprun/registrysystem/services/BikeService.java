package com.suprun.registrysystem.services;

import com.suprun.registrysystem.models.Bike;
import com.suprun.registrysystem.repositories.BikeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class BikeService {

    @Autowired
    private BikeRepository bikeRepository;

    public List<Bike> getBikes(){
        return bikeRepository.findAll();
    }

    public void create(Bike bike){
        bikeRepository.save(bike);
    }

    public Bike get(long id){
        return bikeRepository.getOne(id);
    }
}
