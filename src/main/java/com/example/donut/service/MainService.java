package com.example.donut.service;

import com.example.donut.dao.ProductDao;
import com.example.donut.entity.Product;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MainService {
    private final ProductDao productDao;

    public List<Product> listAllProducts() {
        return productDao.findAll();
    }

    public void deleteProduct(int id) {
        productDao.deleteById(id);
    }
}
