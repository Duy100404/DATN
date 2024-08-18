package com.lab8.controller;

import ch.qos.logback.core.model.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductController {
    @GetMapping("product/list")
    public String listProducts(Model model) {
        return "product/list";
    }

    @RequestMapping("/product/detail/{id}")
    public String detail() {
        return "product/detail";
    }
}
