package com.miao.shop.product.dao;

import com.miao.shop.product.entity.CommentReplayEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品评价回复关系
 *
 * @author liudongyang
 * @email sunlightcs@gmail.com
 * @date 2020-11-24 22:46:01
 */
@Mapper
public interface CommentReplayDao extends BaseMapper<CommentReplayEntity> {

}
