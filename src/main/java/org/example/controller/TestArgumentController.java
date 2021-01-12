package org.example.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xuwenqing
 * Date: 2021-01-12
 * Time: 21:57:23
 */
@RestController
@RequestMapping("/arg")
public class TestArgumentController {

    private static final Logger log = LoggerFactory.getLogger(TestArgumentController.class);


    @GetMapping("holiday/{day}")
//    public Object holiday(@PathVariable("day") String day1) {  //和下面一样的
    public Object holiday(@PathVariable String day) {
        log.debug("获得到请求路径参数:" + day);
        Map<String,Object> map = new HashMap<>();
        map.put("ok",true);
        return map;
    }

    @PostMapping("/login")
    public Object login(@RequestParam String username, @RequestParam String password) {
        log.debug("获取到请求路径参数: username={},password={}",username,password);
        Map<String,Object> map = new HashMap<>();
        map.put("ok",true);
        return map;
    }

    @PostMapping("/login2")//完成代码及测试，Integer改为int，重新测试
//    public Object login2(@RequestParam(required = false) Integer i) {
    public Object login2(@RequestParam(required = false) int i) {
        log.debug("获取到请求路径参数: i={}",i);
        Map<String,Object> map = new HashMap<>();
        map.put("ok",true);
        return map;
    }
}
