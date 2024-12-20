package com.ecommerce.project.service;

import com.ecommerce.project.dto.ProductDTO;
import com.ecommerce.project.dto.ProductResponse;
import com.ecommerce.project.model.Product;

public interface ProductService {

    ProductDTO addProduct(Long categoryId, Product product);
    ProductResponse getAllProducts();
    ProductResponse getProductsByCategory(Long categoryId);
    ProductResponse getProductsByKeyword(String keyword);
}
