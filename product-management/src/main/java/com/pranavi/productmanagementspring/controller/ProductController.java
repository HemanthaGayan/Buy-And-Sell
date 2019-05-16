package com.pranavi.productmanagementspring.controller;

import com.pranavi.productmanagementspring.model.Products;
import com.pranavi.productmanagementspring.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@EnableAutoConfiguration
@RequestMapping(value="/api")
public class ProductController {

    @Autowired
    ProductService service;

    @PostMapping("/save")
    public Products save(@RequestBody Products products){
        service.SaveOrUpdate(products);
        return products;
    }

    @GetMapping("/list")
    public List<Products> list(){
        return service.getAllProducts();
    }

    @GetMapping("/list/{product_no}")
    public Products getById(@PathVariable Long product_no){

        return service.getById(product_no);

    }

    @DeleteMapping("/delete/{product_no}")
    public String deleteProducts(@PathVariable (value="product_no")Long product_no){
        service.DeleteProducts(product_no);
        return "Deleted Successfully id "+product_no;

    }








}
