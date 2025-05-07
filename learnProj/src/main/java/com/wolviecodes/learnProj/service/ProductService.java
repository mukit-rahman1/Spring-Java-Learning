package com.wolviecodes.learnProj.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wolviecodes.learnProj.model.Product;
import com.wolviecodes.learnProj.repo.ProductRepo;

/**
 *
 * @author wolviecodes
 */

 @Service
public class ProductService {
    @Autowired
    private ProductRepo repo;

    public List<Product> getAll(){
        return repo.findAll();
    }
}
