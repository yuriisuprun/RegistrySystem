package com.suprun.registrysystem.repositories;

import com.suprun.registrysystem.models.Bike;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BikeRepository extends JpaRepository<Bike, Long> {
}
