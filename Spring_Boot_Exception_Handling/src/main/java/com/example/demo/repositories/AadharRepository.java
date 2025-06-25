package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.AadharUser;

@Repository
public interface AadharRepository extends JpaRepository<AadharUser, Integer>
{

}
