package com.example.demospringjpa.controller;

import com.example.demospringjpa.entity.product;
import com.example.demospringjpa.respository.ProductRespository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {
    private ProductRespository productRespo;
    public ProductController(ProductRespository productRespo){
        this.productRespo=productRespo;
    }

    @GetMapping("product")
    public ResponseEntity<?> getAll()
    {
        List<product> products=productRespo.findAll();
        if(products.size()==0)
        {
            return new ResponseEntity<>("Khong co data55", HttpStatus.OK);
        }
        return new ResponseEntity<>(products, HttpStatus.OK);
    }


}
