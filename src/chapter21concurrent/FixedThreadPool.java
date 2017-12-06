package chapter21concurrent;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * OkLine(Hangzhou) Co,ltd
 * Created by zhengjun
 * Date: 2017/12/6
 * Mail:zhengjun1987@outlook.com
 */
public class FixedThreadPool {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 5; i++) {
            executorService.execute(new LiftOff());
        }
        executorService.shutdown();
//        #0(9) #1(9) #2(9) #3(9) #4(9) #0(8) #1(8) #2(8) #3(8) #4(8) #0(7) #1(7) #2(7) #3(7) #4(7)
//        #0(6) #1(6) #2(6) #3(6) #4(6) #0(5) #1(5) #2(5) #2(4) #3(5) #4(5) #1(4) #0(4) #2(3) #3(4)
//        #4(4) #1(3) #0(3) #2(2) #3(3) #4(3) #1(2) #2(1) #0(2) #3(2) #0(1) #1(1) #4(2) #3(1)
//        #2(LiftOff!pool-1-thread-3)
//        #0(LiftOff!pool-1-thread-1)
//        #1(LiftOff!pool-1-thread-2)
//        #4(1)
//        #3(LiftOff!pool-1-thread-4)
//        #4(LiftOff!pool-1-thread-5)
    }
}
