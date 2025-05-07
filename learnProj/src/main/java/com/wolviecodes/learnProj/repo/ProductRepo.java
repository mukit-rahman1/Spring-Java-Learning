 package com.wolviecodes.learnProj.repo;

 import org.springframework.data.jpa.repository.JpaRepository;
 import org.springframework.stereotype.Repository;

 import com.wolviecodes.learnProj.model.Product;
 
 /**
  *
  * @author wolviecodes
  */
 
  @Repository
 public interface ProductRepo extends JpaRepository<Product, Integer>{

 }
 