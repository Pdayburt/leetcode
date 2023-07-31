package com.anatkh.leetcode;

import cn.hutool.core.date.DateTime;
import cn.hutool.core.date.DateUtil;
import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.ILoggerFactory;

import java.util.Date;
import java.util.function.Consumer;
import java.util.function.Function;

@Slf4j
public class TestConsumer {

    public static void main(String[] args) {
//        int i = TestConsumer.testCalculate(Integer::sum, 6, 9);
//        System.out.println(i);

//        int i = TestConsumer.testCalculate(Integer::sum, 100, 200);
//        System.out.println(i);

        testConsumer(System.out::println,99);
        Integer integer = testFunctional((x) -> {
            return x + 100;
        }, 1000);
        System.out.println(integer);

    }


    public static Integer testFunctional(Function<Integer,Integer> function,Integer value){
        return function.apply(value);
    }
    public static int testCalculate(MyCalculator myCalculator,int i,int j){
        int res = 0;
        try {
             res = myCalculator.doCalculate(i, j);
        }catch (Exception e) {
            e.printStackTrace();
            log.error("error is happening:",e);
        }
        return res;
    }

    public static void testConsumer(Consumer<Integer> consumer,Integer value){
        consumer.accept(value);
    }

}

