package com.example.mallservice.impl;

import com.example.proservice.entity.Product;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient("PRODUCT-SERVICE")
public interface ProductService {

    @RequestMapping(value = "/products", method = RequestMethod.GET)
    List<Product> findAll();

    @RequestMapping(value = "/products/{itemCode}", method = RequestMethod.GET)
    Product loadByItemCode(@PathVariable("itemCode") String itemCode);

}