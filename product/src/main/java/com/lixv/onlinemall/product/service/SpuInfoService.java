package com.lixv.onlinemall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lixv.common.utils.PageUtils;
import com.lixv.onlinemall.product.entity.SpuInfoEntity;

import java.util.Map;

/**
 * spu信息
 *
 * @author lixv
 * @email lix-u@qq.com
 * @date 2024-07-24 14:39:33
 */
public interface SpuInfoService extends IService<SpuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

