package com.example.Bai2.service;

import com.example.Bai2.model.Product;
import com.example.Bai2.repository.ProductRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
@Data
public class ProductService {
    @Autowired
    ProductRepository productRepository;
    public Page<Product> getAllUsersWithPagination(int offset, int pageSize) {
        Page<Product> products = productRepository.findAll(PageRequest.of(offset,pageSize));
        return products;
    }

    public Product createNewProduct(Product product) {
        return productRepository.save(product);
    }
}
