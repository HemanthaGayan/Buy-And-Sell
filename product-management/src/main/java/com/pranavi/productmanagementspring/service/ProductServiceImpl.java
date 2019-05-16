package com.pranavi.productmanagementspring.service;

import com.pranavi.productmanagementspring.model.Products;
import com.pranavi.productmanagementspring.restory.ProductRespostory;
import com.pranavi.productmanagementspring.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional

public class ProductServiceImpl implements ProductService {
    @Autowired
    ProductRespostory respostory;

    @Override
    public List<Products> getAllProducts() {
        return (List<Products>)respostory.findAll();
    }

    @Override
    public Products getById(Long product_no) {
        return respostory.findById(product_no).get();
    }

    @Override
    public void SaveOrUpdate(Products products) {
    respostory.save(products);
    }

    @Override
    public void DeleteProducts(Long product_no) {
    respostory.deleteById(product_no);
    }
}
