package com.juc;

import lombok.extern.java.Log;
import lombok.extern.log4j.Log4j2;

import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Auther: rxd
 * @Date: 2020/5/14 15:27
 * @Description:
 */
@Log4j2
public class ThreadPoolExecutorTest {
    public static ThreadPoolExecutor executor = new ThreadPoolExecutor(5, 10, 60, TimeUnit.SECONDS,
            new LinkedBlockingDeque<>(50), new MyThreadFactory(), new ThreadPoolExecutor.AbortPolicy());

    public static class MyThreadFactory implements ThreadFactory{
        private final AtomicInteger atomicInteger = new AtomicInteger(1);
        private static String threadName = "Thread-xiaoxi-";

        @Override
        public Thread newThread(Runnable r) {
            Thread thread = new Thread(r,threadName+atomicInteger.getAndIncrement());
            return thread;
        }
    }

    private static void executorStatus(ThreadPoolExecutor executor){
        LinkedBlockingDeque queue = (LinkedBlockingDeque)executor.getQueue();
        log.info("核心线程数： {},活动线程数：{},最大线程数：{}，" +
                        "任务完成数：{}，队列大小：{}，当前排队线程数：{}，" +
                        "队列剩余大小：{}",
                executor.getCorePoolSize(),executor.getActiveCount(),executor.getMaximumPoolSize(),
                executor.getCompletedTaskCount(),queue.size()+queue.remainingCapacity(),queue.size()
                );
    }

    public static void main(String[] args) {
        for (int i=0;i<100;i++){
            executor.execute(()->{
                executorStatus(executor);
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }
    }


}
