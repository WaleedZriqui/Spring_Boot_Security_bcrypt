package com.example.demo.project.Repository;

import com.example.demo.project.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Person, Integer> {
}
