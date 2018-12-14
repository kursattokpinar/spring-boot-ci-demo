/**
 * ymm56.com Inc. Copyright (c) 2013-2018 All Rights Reserved.
 */
package com.song.demo.action;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author song.li
 * @version $Id: RootController.java, v 0.1 2018-12-14 17:01 song.li Exp $$
 */
@RestController
public class RootController {

    @RequestMapping("/")
    public String hello() {
        return "hello world";
    }
}