package com.pranavi.productmanagementspring.service;

import com.pranavi.productmanagementspring.model.Products;

import java.util.List;

public interface ProductService {
    public List<Products> getAllProducts();

    public Products getById(Long product_no);

     public void SaveOrUpdate(Products products);

     public void DeleteProducts(Long product_no);


}
