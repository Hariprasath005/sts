package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.PetMappingModel;
@Repository

public interface PetMappingRepository extends JpaRepository<PetMappingModel,Integer>
{

}