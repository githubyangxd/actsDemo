package com.hxyd.service;

import com.hxyd.interfaze.AbcInterfase;
import org.springframework.stereotype.Service;

/**
 * Created by Yondervision on 2020/4/13.
 */
//@Service
public class AbcService implements AbcInterfase {
//    @Test
    public void method1() {
        System.out.println("mmmmm1111111111111111");
    }

//    @Test
    public String method2(String param) {
        System.out.println("mmmmmmm22222222:::" + param);
        return param;
    }
}
