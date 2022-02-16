package com.transaction;

import org.springframework.transaction.annotation.Transactional;

/**
 * @author : zjw
 * @date : 15:09 2022/2/15
 */
public class TestService {

    @Transactional(rollbackFor=Exception.class)
    public void saveUser(){
    }

}
