package com.lixv.onlinemall.product.dao;

import com.lixv.onlinemall.product.entity.CommentReplayEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品评价回复关系
 * 
 * @author lixv
 * @email lix-u@qq.com
 * @date 2024-07-24 14:39:34
 */
@Mapper
public interface CommentReplayDao extends BaseMapper<CommentReplayEntity> {
	
}
