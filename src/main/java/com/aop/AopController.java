package com.aop;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/aop")
public class AopController {
    @GetMapping(value = "/getTest")
    public JSONObject aopTest() {
        return JSON.parseObject("{\"message\":\"SUCCESS\",\"code\":200}");
    }

    //结果通过地址栏访问hello方法报不支持Get访问，原来地址栏输入链接默认都是Get方式，将@PostMapping改为@RequestMapping就可以了
    @PostMapping(value = "/postTest")
    public JSONObject aopTest2() {
        return JSON.parseObject("{\"message\":\"SUCCESS\",\"code\":200}");
    }

}
