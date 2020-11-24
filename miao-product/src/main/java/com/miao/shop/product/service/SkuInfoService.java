package com.miao.shop.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.miao.common.utils.PageUtils;
import com.miao.shop.product.entity.SkuInfoEntity;

import java.util.Map;

/**
 * sku信息
 *
 * @author liudongyang
 * @email sunlightcs@gmail.com
 * @date 2020-11-24 22:46:01
 */
public interface SkuInfoService extends IService<SkuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

