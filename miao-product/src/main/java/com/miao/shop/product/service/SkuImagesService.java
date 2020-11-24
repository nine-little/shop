package com.miao.shop.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.miao.common.utils.PageUtils;
import com.miao.shop.product.entity.SkuImagesEntity;

import java.util.Map;

/**
 * sku图片
 *
 * @author liudongyang
 * @email sunlightcs@gmail.com
 * @date 2020-11-24 22:46:01
 */
public interface SkuImagesService extends IService<SkuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

