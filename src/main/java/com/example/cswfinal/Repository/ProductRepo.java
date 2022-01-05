package com.example.cswfinal.Repository;

import com.example.cswfinal.Model.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<ProductEntity , Integer> {
}
