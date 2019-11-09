package com.itheima.ssm.service;

import com.itheima.ssm.domain.Product;

import java.util.List;

public interface IProductService {


    public List<Product> findAall() throws Exception;

    public void save(Product product) throws Exception;
}
