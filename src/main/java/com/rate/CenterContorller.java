package com.rate;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by lsh on 2018/10/21.
 *
 * @author lsh
 * @date 2018/10/21
 */
@Controller
public class CenterContorller {

    @RequestMapping("/rate")
    public void test(){
        System.out.println("this is controller");
    }

    @RequestMapping("/hello")
    public String hello(){
        System.out.println("this is hello");
        return "hello";
    }
}
