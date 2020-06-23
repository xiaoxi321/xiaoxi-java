package com.juc;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Auther: rxd
 * @Date: 2020/5/13 11:21
 * @Description:
 */
public class ThreadPoolExecutorTest1 {
    private static final int COUNT_BITS = Integer.SIZE - 3;
    private static final int CAPACITY   = (1 << COUNT_BITS) - 1;

    // runState is stored in the high-order bits
    private static final int RUNNING    = -1 << COUNT_BITS;
    private static final int SHUTDOWN   =  0 << COUNT_BITS;
    private static final int STOP       =  1 << COUNT_BITS;
    private static final int TIDYING    =  2 << COUNT_BITS;
    private static final int TERMINATED =  3 << COUNT_BITS;
    // Packing and unpacking ctl
    private static int runStateOf(int c)     { return c & ~CAPACITY; }
    private static int workerCountOf(int c)  { return c & CAPACITY; }
    private static int ctlOf(int rs, int wc) { return rs | wc; }

    private static  AtomicInteger ctl = new AtomicInteger(ctlOf(RUNNING, 0));
    public static void main(String[] args) {
//        System.out.println(RUNNING);
//        System.out.println(SHUTDOWN);
//        System.out.println(STOP);
//        System.out.println(TIDYING);
//        System.out.println(TERMINATED);

        System.out.println(ctl.get());
        System.out.println(ctl.incrementAndGet());
        while (ctl.compareAndSet(ctl.get(),2)){
            System.out.println(ctl.get());
            break;
        }
        System.out.println(ctl.get());
    }

    /**
     * Acc full GC:
     * Sum of all pauses due to full collections
     * Number of full GC pauses:
     * Count of all pauses due to full collections
     * Acc GC:
     * Sum of all full GC pauses
     * Avg full GC:
     * Average length of a full GC pause
     * Min / max full GC pause:
     * Shortest / longest full GC pause
     * Min / max full GC pause interval:
     * Min / max interval between two pauses due to full collections
     */
}
