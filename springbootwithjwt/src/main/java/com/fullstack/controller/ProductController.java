package com.fullstack.controller;

import com.fullstack.model.Product;
import com.fullstack.service.IProductService;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/products")
@SecurityRequirement(name = "Bearer Auth")
public class ProductController {

    @Autowired
    private IProductService productService;

    @PostMapping("/save")
    public ResponseEntity<Product> save(@RequestBody Product product) {
        return ResponseEntity.ok(productService.save(product));
    }

    @GetMapping("/findall")
    public ResponseEntity<List<Product>> findAll() {
        return ResponseEntity.ok(productService.findAll());
    }
}
