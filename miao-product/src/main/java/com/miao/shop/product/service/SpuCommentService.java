package com.miao.shop.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.miao.common.utils.PageUtils;
import com.miao.shop.product.entity.SpuCommentEntity;

import java.util.Map;

/**
 * 商品评价
 *
 * @author liudongyang
 * @email sunlightcs@gmail.com
 * @date 2020-11-24 22:46:01
 */
public interface SpuCommentService extends IService<SpuCommentEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

