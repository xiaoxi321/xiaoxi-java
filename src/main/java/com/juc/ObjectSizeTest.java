package com.juc;

import lombok.Data;
import org.apache.lucene.util.RamUsageEstimator;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Auther: rxd
 * @Date: 2020/5/13 17:21
 * @Description:
 */
public class ObjectSizeTest {
    public static void main(String[] args) {
        Object o = new Object();
        byte[] b = new byte[1*1024];
        List<byte[]> list = new ArrayList<>();
        list.add(b);
        list.add(new byte[1024*1034*5]);
        List<ATest> aTestList = new ArrayList<>();
        for (int i = 0;i<10000;i++){
            aTestList.add(new ATest(20,"xiaoxi",130000L));
        }
        System.out.println(strSize(aTestList));
        System.out.println(strSize(o));
        System.out.println(strSize(b));
        System.out.println(strSize(list));
    }


    public static String strSize(Object o){
        return RamUsageEstimator.humanReadableUnits(RamUsageEstimator.sizeOfObject(o));
    }

    @Data
    static class  ATest {
        private Integer age;
        private String name;
        private Long volume;

        public ATest(Integer age, String name, Long volume) {
            this.age = age;
            this.name = name;
            this.volume = volume;
        }
    }
}
