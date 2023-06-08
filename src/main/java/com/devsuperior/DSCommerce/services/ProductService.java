package com.devsuperior.DSCommerce.services;

import com.devsuperior.DSCommerce.dto.ProductDto;
import com.devsuperior.DSCommerce.entities.Product;
import com.devsuperior.DSCommerce.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;
    @Transactional(readOnly = true)
    public ProductDto finById(Long id){
        Product product = repository.findById(id).get();
        return new ProductDto(product);
    }
}
