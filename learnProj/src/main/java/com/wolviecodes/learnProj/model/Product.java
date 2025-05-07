/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.wolviecodes.learnProj.model;

import java.math.BigDecimal;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 *
 * @author wolviecodes
 */

 @Entity
 @Data
 @AllArgsConstructor
 @NoArgsConstructor
public class Product {
    @Id
    private int id;
    private String name;
    private String desc;
    private String brand;
    private BigDecimal price;
    private String category;
    private Date releaseDate; //why date is predef
    private boolean available;
    private int quantity;

}
