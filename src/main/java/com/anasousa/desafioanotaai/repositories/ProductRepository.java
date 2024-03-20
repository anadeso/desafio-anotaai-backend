package com.anasousa.desafioanotaai.repositories;

import com.anasousa.desafioanotaai.domain.category.Category;
import com.anasousa.desafioanotaai.domain.product.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
}
