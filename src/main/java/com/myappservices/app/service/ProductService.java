package com.myappservices.app.service;


import com.myappservices.app.entity.Product;
import com.myappservices.app.repository.ProductRepository;
import com.myappservices.app.service.impl.BaseServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class ProductService extends BaseServiceImpl<Product, Long> {
    public ProductService(ProductRepository repository) {
        super(repository);
    }
}
