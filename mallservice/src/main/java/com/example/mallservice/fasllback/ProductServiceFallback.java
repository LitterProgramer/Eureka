package com.example.mallservice.fasllback;

import com.example.mallservice.impl.ProductService;
import com.example.proservice.entity.Product;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Collections;
import java.util.List;

@Component
public class ProductServiceFallback implements ProductService {
    @Override
    public List<Product> findAll() {
        return Collections.emptyList();
    }

    @Override
    public Product loadByItemCode(@PathVariable("itemCode") String itemCode) {
        return new Product("error", "未知", "TwoStepsFromJava-Fallback", 0);
    }
}