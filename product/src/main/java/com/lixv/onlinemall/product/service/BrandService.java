package com.lixv.onlinemall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lixv.common.utils.PageUtils;
import com.lixv.onlinemall.product.entity.BrandEntity;

import java.util.Map;

/**
 * 品牌
 *
 * @author lixv
 * @email lix-u@qq.com
 * @date 2024-07-24 14:39:35
 */
public interface BrandService extends IService<BrandEntity> {

    PageUtils queryPage(Map<String, Object> params);

    void updateDetail(BrandEntity brand);
}

