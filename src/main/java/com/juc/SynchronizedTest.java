package com.juc;

/**
 * @Auther: rxd
 * @Date: 2020/5/15 16:19
 * @Description:
 */
public class SynchronizedTest {
    public void say(){
        synchronized (this){
            System.out.println("say hello!");
        }
    }
}
