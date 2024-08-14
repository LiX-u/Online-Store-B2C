package com.lixv.common.to;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author lixv
 * @email lix-u@qq.com
 * @date 2024-07-24 14:39:35
 */
@Data
public class MemberPrice {

    private Long id;
    private String name;
    private BigDecimal price;

}