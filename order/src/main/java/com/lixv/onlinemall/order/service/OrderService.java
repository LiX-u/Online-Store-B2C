package com.lixv.onlinemall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lixv.common.utils.PageUtils;
import com.lixv.onlinemall.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author lixv
 * @email lix-u@qq.com
 * @date 2024-07-25 21:16:16
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

