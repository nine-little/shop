package com.miao.shop.product;

import com.miao.shop.product.entity.BrandEntity;
import com.miao.shop.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MiaoProductApplicationTests {
    @Autowired
    BrandService brandService;
    @Test
    void contextLoads() {
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setDescript("测试");
        brandEntity.setName("吴二狗");
        brandService.save(brandEntity);
        System.out.println("保存成功");
    }

}
