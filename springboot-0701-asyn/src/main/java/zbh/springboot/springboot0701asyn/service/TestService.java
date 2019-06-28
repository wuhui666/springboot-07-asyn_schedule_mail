package zbh.springboot.springboot0701asyn.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * @author: wuhui
 * @time: 2019/6/28 17:15
 * @desc:
 */
@Service
public class TestService {
    public void doSomething(){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("doSomething is finished!");
    }
    @Async
    public void doSomethingAsync(){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("doSomethingAsync is finished!");
    }
}
