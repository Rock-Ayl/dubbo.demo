package com.rock.dubbo.product.controller;

import com.rock.dubbo.product.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/getUserData")
    public String getUserData() {
        return productService.getUserData();
    }

    @GetMapping("/getUserData2")
    public String getUserData2(String word) {
        //实现
        return productService.getUserData2(word);
    }

}
