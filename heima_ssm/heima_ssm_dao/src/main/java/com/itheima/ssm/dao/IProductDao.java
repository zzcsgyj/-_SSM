package com.itheima.ssm.dao;

import com.itheima.ssm.domain.Product;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface IProductDao {

    //查询所有产品信息
    @Select("select * from product")
    public List<Product> findAll()throws Exception;

    //查询单个产品信息
    @Select("select * from product where id = #{productId}")
    public List<Product> findById(Integer productId)throws Exception;

    //添加产品信息
    @Insert("insert into product(productNum,productName,cityName,departureTime,productPrice,productDesc,productStatus) " +
            "values(#{productNum},#{productName},#{cityName},#{departureTime},#{productPrice},#{productDesc},#{productStatus})")
    public void save(Product product) throws Exception;

}
