package org.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xuwenqing
 * Date: 2020-12-31
 * Time: 01:01:48
 */
@Controller
public class Test2Controller {
    @RequestMapping("/test2")
    public String test() {
        return "forward:/home.html";
    }

}
