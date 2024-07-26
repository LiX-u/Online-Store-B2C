package com.lixv.onlinemall.order.dao;

import com.lixv.onlinemall.order.entity.PaymentInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 支付信息表
 * 
 * @author lixv
 * @email lix-u@qq.com
 * @date 2024-07-25 21:16:16
 */
@Mapper
public interface PaymentInfoDao extends BaseMapper<PaymentInfoEntity> {
	
}
