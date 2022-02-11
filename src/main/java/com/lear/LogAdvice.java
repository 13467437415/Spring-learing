package com.lear;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
  * @Author : zjw
  * @Date :2022/2/11 14:23
  * @Description: 切面类 ：包括 切点,处理
  */
@Aspect
@Component
public class LogAdvice {
    //地点
    // 定义一个切点：所有被GetMapping注解修饰的方法会织入advice
    @Pointcut("@annotation(org.springframework.web.bind.annotation.GetMapping)")
    private void getPointcut() {}

    //地点
    // 定义一个切点：所有被GetMapping注解修饰的方法会织入advice
    @Pointcut("@annotation(org.springframework.web.bind.annotation.PostMapping)")
    private void postPointcut() {}


    //处理,(任务)
	// Before表示logAdvice将在目标方法执行前执行
    @Before("getPointcut()")
    public void getAdvice(){
    	// 这里只是一个示例，你可以写任何处理逻辑
        System.out.println("get请求------------------------------------------");
    }

    //处理,(任务)
    // Before表示logAdvice将在目标方法执行前执行
    @Before("postPointcut()")
    public void postAdvice(){
        // 这里只是一个示例，你可以写任何处理逻辑
        System.out.println("post请求------------------------------------------");
    }
}
