package com.myappservices.app.repository;


import com.myappservices.app.entity.Product;
import org.springframework.stereotype.Repository;

@Repository 
public interface ProductRepository extends BaseRepository<Product, Long> { 
}
