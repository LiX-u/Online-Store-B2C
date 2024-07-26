package com.lixv.onlinemall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lixv.common.utils.PageUtils;
import com.lixv.onlinemall.ware.entity.UndoLogEntity;

import java.util.Map;

/**
 * 
 *
 * @author lixv
 * @email lix-u@qq.com
 * @date 2024-07-25 21:22:57
 */
public interface UndoLogService extends IService<UndoLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

