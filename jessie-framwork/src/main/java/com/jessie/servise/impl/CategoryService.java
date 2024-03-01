package com.jessie.servise.impl;

import com.jessie.domain.ResponseResult;
import com.jessie.domain.vo.CategoryVo;
import com.jessie.domain.vo.PageVo;
import com.baomidou.mybatisplus.extension.service.IService;
import com.jessie.domain.entity.Category;

import java.util.List;

public interface CategoryService extends IService<Category> {
    //查询文章分类的接口
    ResponseResult getCategoryList();

    //写博客-查询文章分类的接口
    List<CategoryVo> listAllCategory();
    //分页查询分类列表
    PageVo selectCategoryPage(Category category, Integer pageNum, Integer pageSize);