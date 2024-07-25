package com.lixv.onlinemall.product.dao;

import com.lixv.onlinemall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author lixv
 * @email lix-u@qq.com
 * @date 2024-07-24 14:39:34
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
