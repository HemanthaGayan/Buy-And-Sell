package com.pranavi.productmanagementspring.restory;

import com.pranavi.productmanagementspring.model.Products;
import org.springframework.data.repository.CrudRepository;

public interface ProductRespostory extends CrudRepository<Products, Long> {

}
