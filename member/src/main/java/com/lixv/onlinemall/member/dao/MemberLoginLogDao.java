package com.lixv.onlinemall.member.dao;

import com.lixv.onlinemall.member.entity.MemberLoginLogEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员登录记录
 * 
 * @author lixv
 * @email lix-u@qq.com
 * @date 2024-07-25 21:08:15
 */
@Mapper
public interface MemberLoginLogDao extends BaseMapper<MemberLoginLogEntity> {
	
}
