package com.example.demospringjpa.controller;

import com.example.demospringjpa.entity.product;
import com.example.demospringjpa.respository.ProductRespository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("product")
public class ProductController {
    private ProductRespository productRespo;
    public ProductController(ProductRespository productRespo){
        this.productRespo=productRespo;
    }

    @GetMapping
    public ResponseEntity<?> getAll()
    {
        List<product> products=productRespo.findAll();
        if(products.size()==0)
        {
            return new ResponseEntity<>("Khong co data55", HttpStatus.OK);
        }
        return new ResponseEntity<>(products, HttpStatus.OK);
    }

    @GetMapping("{id}")
    public ResponseEntity<?> getById(@PathVariable Integer id)
    {
        Optional<product> product=productRespo.findById(id);
        if(product.isEmpty())
        {
            return new ResponseEntity<>("khong co id"+id, HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(product.get(), HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity<?> create()
    {
        System.out.println(88);
        System.out.println("hahaha");
        return new ResponseEntity<>(null, HttpStatus.OK);
    }
}
