package com.example.cswfinal.Response;

import com.example.cswfinal.Model.ProductEntity;
import org.mapstruct.Mapper;
import org.mapstruct.NullValueCheckStrategy;

@Mapper(componentModel = "spring", nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS)
public interface ProductMapper {
    ProductDTO ConvertToDto(ProductEntity productEntity);
    ProductEntity ConverToEntity(ProductDTO productDTO);
}
