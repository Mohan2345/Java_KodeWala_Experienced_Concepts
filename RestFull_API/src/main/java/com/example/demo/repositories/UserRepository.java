package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Aadhar_User;

@Repository
public interface UserRepository extends JpaRepository<Aadhar_User, Integer>
{

}
