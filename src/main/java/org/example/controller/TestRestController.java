package org.example.controller;

import org.example.model.JSONResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xuwenqing
 * Date: 2021-01-02
 * Time: 22:00:58
 */
@RestController
@RequestMapping("/rest")
public class TestRestController {

    @GetMapping("/1")
    public Object test1() {
        JSONResponse resp = new JSONResponse();
        resp.setData("LOG001");
        resp.setMessage("用户不存在");
        resp.setData(new Date());
        return resp;
    }
}
