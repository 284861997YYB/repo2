package cn.itcast.controller;

import cn.itcast.domain.Account;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: yyb
 * @Date: 2019/5/30 13:57
 * @Description:
 */
@Controller
@RequestMapping(path = "/Account")
public class StartController {

    @RequestMapping(path = "/hello")
    public String sayHello(){
        System.out.println("sayHello........");
        return "success";
    }


    @RequestMapping(path = "/testAccount" )
    public  String testAccount(Account account){
        System.out.println(account);


        return "success";
    }

    @RequestMapping(path = "/testStringtoDateConverter" )
    public  String testStringtoDateConverter(Account account){
        System.out.println(account);
        return "success";
    }
}
