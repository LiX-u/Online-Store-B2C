package com.lixv.onlinemall.order.dao;

import com.lixv.onlinemall.order.entity.OrderSettingEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单配置信息
 * 
 * @author lixv
 * @email lix-u@qq.com
 * @date 2024-07-25 21:16:16
 */
@Mapper
public interface OrderSettingDao extends BaseMapper<OrderSettingEntity> {
	
}
