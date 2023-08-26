package com.prithvi.productservice.repository;

import com.prithvi.productservice.models.Product;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface ProductRepository extends MongoRepository<Product, String> {
}
