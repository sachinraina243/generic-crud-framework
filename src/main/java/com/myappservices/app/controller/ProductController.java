package com.myappservices.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.myappservices.app.entity.Product;
import com.myappservices.app.service.ProductService;

@RestController
@RequestMapping("/api/products")
@CrossOrigin(origins = "*") 
public class ProductController extends BaseController<Product, Long> {

    
    @Autowired
    public ProductController(ProductService service) {
        super(service);
    }
}