package com.lixv.onlinemall.member.feign;

import com.lixv.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author LiX-u
 * @date 2024/7/26 下午6:39
 * @description CouponFeignService
 */

@FeignClient("coupon")
public interface CouponFeignService {

    @RequestMapping("/coupon/coupon/member/list")
    public R membercoupons();
}
