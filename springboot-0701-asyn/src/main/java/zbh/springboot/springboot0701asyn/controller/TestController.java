package zbh.springboot.springboot0701asyn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import zbh.springboot.springboot0701asyn.service.TestService;

/**
 * @author: wuhui
 * @time: 2019/6/28 17:02
 * @desc:
 */
@RestController
public class TestController {

    @Autowired
    TestService service;
    //@Async，这玩意儿应该在service方法上，不是controller
    @GetMapping("/getTest")
    public String test() throws InterruptedException {
        /*模拟复杂处理耗时*/
        service.doSomething();
        return "test";/*先打印，再响应*/
    }

    @GetMapping("/getTestAsyn")
    public String testAsyn() throws InterruptedException {
        /*模拟复杂处理耗时*/
        service.doSomethingAsync();//异步
        return "test(asyn)";/*先响应，再打印*/
    }
}

