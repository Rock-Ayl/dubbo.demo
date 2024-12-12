package com.rock.dubbo.product.service.impl;

import com.rock.dubbo.api.user.UserRemoteService;
import com.rock.dubbo.product.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class ProductServiceImpl implements ProductService {

    /**
     * 服务注入
     * 并指定服务分组,不同分组无法调用
     */
    @DubboReference(group = "groupA")
    private UserRemoteService userRemoteService;

    public String getUserData() {
        //实现
        return userRemoteService.helloWorld();
    }

}
