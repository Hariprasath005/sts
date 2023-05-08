package com.example.demo.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.pojo.pojoclass;
@Repository
public interface customerRep extends JpaRepository<pojoclass,Integer>
{
 

}
