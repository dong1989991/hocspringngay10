package com.example.demospringjpa.respository;

import com.example.demospringjpa.entity.product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRespository extends JpaRepository<product,Integer>{

}
