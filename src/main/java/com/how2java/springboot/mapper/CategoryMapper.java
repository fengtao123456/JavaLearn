package com.how2java.springboot.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.how2java.springboot.pojo.Category;

/**
 * 使用注解的方式
 */
@Mapper
public interface CategoryMapper {

    @Select("select * from category_ ")
    List<Category> findAll();


}