package com.example.tapukiraci.repository;

import com.example.tapukiraci.model.Tapu;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TapuRepository extends JpaRepository<Tapu, Integer> {

}
