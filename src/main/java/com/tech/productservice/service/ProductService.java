package com.tech.productservice.service;

import com.tech.productservice.dto.ProductRequest;
import com.tech.productservice.dto.ProductResponse;

import java.util.List;

public interface ProductService {
    void save(ProductRequest productRequest);
    List<ProductResponse> getAll();
}
