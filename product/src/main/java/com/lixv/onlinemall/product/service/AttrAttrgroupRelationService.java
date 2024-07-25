package com.lixv.onlinemall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lixv.common.utils.PageUtils;
import com.lixv.onlinemall.product.entity.AttrAttrgroupRelationEntity;

import java.util.Map;

/**
 * 属性&属性分组关联
 *
 * @author lixv
 * @email lix-u@qq.com
 * @date 2024-07-24 14:39:35
 */
public interface AttrAttrgroupRelationService extends IService<AttrAttrgroupRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

