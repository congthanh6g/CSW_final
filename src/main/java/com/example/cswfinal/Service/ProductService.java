package com.example.cswfinal.Service;

import com.example.cswfinal.Response.ProductDTO;

import java.util.List;

public interface ProductService {
    List<ProductDTO> getAllProduct();
    ProductDTO addProduct(ProductDTO productDTO);
    ProductDTO sellProduct(int id , int quantity);
}
