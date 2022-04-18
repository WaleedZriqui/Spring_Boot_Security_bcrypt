package com.example.demo.project.Repository;

import com.example.demo.project.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Users, Long> {
    Users findByName(String name);
}
