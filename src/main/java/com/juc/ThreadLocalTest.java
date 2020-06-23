package com.juc;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * @Auther: rxd
 * @Date: 2020/5/16 11:06
 * @Description:
 */
public class ThreadLocalTest {
    public static SimpleDateFormat format1 = new SimpleDateFormat("yyyyMMddhh24mmss");

    private static ThreadLocal<SimpleDateFormat> formatThreadLocal = new ThreadLocal<>();

    static {
        formatThreadLocal.set(format1);
    }
    public static void main(String[] args) {
        for(int i=0;i<50;i++){
            Thread thread1 = new Thread(() -> {
                System.out.println("format1: "+format1.format(new Date()));
//                try {
//                    TimeUnit.SECONDS.sleep(1);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
            });
            Thread thread2 = new Thread(() -> {
                System.out.println("format2: "+format1.format(new Date()));
            });
            thread1.start();
            thread2.start();
        }
    }
}
