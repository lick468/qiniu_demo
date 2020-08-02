package com.nenu.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 这是新的控制器
 */
@RestController
public class ContentController {
 @PostMapping(value = "/de")
    public String con() {
     return "";
 }

}
