package com.lixv.onlinemall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lixv.common.utils.PageUtils;
import com.lixv.onlinemall.product.entity.SpuInfoDescEntity;

import java.util.Map;

/**
 * spu信息介绍
 *
 * @author lixv
 * @email lix-u@qq.com
 * @date 2024-07-24 14:39:34
 */
public interface SpuInfoDescService extends IService<SpuInfoDescEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

