package com.abelkibebe.productservice.repository;

import com.abelkibebe.productservice.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
}
