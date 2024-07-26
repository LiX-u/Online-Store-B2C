package com.lixv.onlinemall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lixv.common.utils.PageUtils;
import com.lixv.onlinemall.member.entity.MemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author lixv
 * @email lix-u@qq.com
 * @date 2024-07-25 21:08:15
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

