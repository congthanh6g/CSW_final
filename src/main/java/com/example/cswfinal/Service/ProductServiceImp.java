package com.example.cswfinal.Service;

import com.example.cswfinal.Model.ProductEntity;
import com.example.cswfinal.Repository.ProductRepo;
import com.example.cswfinal.Response.ProductDTO;
import com.example.cswfinal.Response.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductServiceImp implements ProductService {
    @Autowired
    ProductRepo productRepo;
    @Autowired
    ProductMapper productMapper;

    @Override
    public List<ProductDTO> getAllProduct() {
        List<ProductEntity> listE = productRepo.findAll();
        List<ProductDTO> listD = new ArrayList<>();
        for (ProductEntity p : listE)
        {
            ProductDTO productDTO = productMapper.ConvertToDto(p);
            listD.add(productDTO);
        }
        return listD;
    }

    @Override
    public ProductDTO addProduct(ProductDTO productDTO) {
        ProductEntity productEntity = productMapper.ConverToEntity(productDTO);
        productRepo.save(productEntity);
        ProductDTO productdto = productMapper.ConvertToDto(productEntity);
        return productdto;
    }

    @Override
    public ProductDTO sellProduct(int id, int quantity) {
        List<ProductEntity> listP = productRepo.findAll();
        for (int i = 0 ; i < listP.size() ; i++)
        {
            ProductEntity productEntity = listP.get(i);
            if (productEntity.getId() == id)
            {
                productEntity.setQuantity(productEntity.getQuantity() - quantity);
                productRepo.save(productEntity);
                ProductDTO productDTO = productMapper.ConvertToDto(productEntity);
                return productDTO;
            }
        }
        return null;
    }
}
