/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.wolviecodes.learnProj.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wolviecodes.learnProj.model.Product;
import com.wolviecodes.learnProj.service.ProductService;

/**
 *
 * @author wolviecodes
 */
@RestController
@RequestMapping("/api")
public class ProductController {

    @Autowired
    private ProductService service;

    @RequestMapping("/")
    public String greet(){
        return("SUPsup");
    }

    @GetMapping("/products")
    public List<Product> getAll(){
        return service.getAll();
    }

    
}
