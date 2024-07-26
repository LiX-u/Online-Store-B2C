package com.lixv.onlinemall.coupon.dao;

import com.lixv.onlinemall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author lixv
 * @email lix-u@qq.com
 * @date 2024-07-25 20:53:54
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
