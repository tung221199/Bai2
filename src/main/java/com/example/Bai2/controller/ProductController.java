package com.example.Bai2.controller;

import com.example.Bai2.model.Product;
import com.example.Bai2.service.ProductService;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/products")
@Data
public class ProductController {
    @Autowired
    ProductService productService;

    @GetMapping("/pagination/{offset}/{pageSize}")
    public ResponseEntity<Page<Product>> getWithPage(@PathVariable int offset, @PathVariable int pageSize){
        Page<Product> list = productService.getAllUsersWithPagination(offset,pageSize);
        return ResponseEntity.ok(list);
    }

    @PostMapping()
    public ResponseEntity<Product>post(@RequestBody Product product){
        return ResponseEntity.ok(productService.createNewProduct(product));
    }
}
