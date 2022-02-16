package com.aop;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : zjw
 * @date : 9:42 2022/2/14
 */

@RestController
@RequestMapping("/bfAop")
public class BeforeAndAfterCon {
    @GetMapping("/{val}")
    public String testAop(@PathVariable Integer val) {
        System.out.println(1/val);
        return "Hello " + val;
    }
}
