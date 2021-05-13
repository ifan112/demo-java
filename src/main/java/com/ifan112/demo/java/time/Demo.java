package com.ifan112.demo.java.time;

import java.time.Clock;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.TemporalAdjusters;

public class Demo {

    public static void main(String[] args) {
        // LocalDateTime now = LocalDateTime.now();
        // System.out.println(now);
        //
        // LocalDateTime firstDayOfMonth = now.with(TemporalAdjusters.firstDayOfMonth());
        // System.out.println(firstDayOfMonth);
        //
        // System.out.println(now.hashCode());
        // System.out.println(firstDayOfMonth.hashCode());

        /*
         * Clock 时钟，可以带有时区，表示某一个地区的时钟，Instant 是基于 Clock 实现的。
         * 但是 Clock 在转换成 Instant 时永远不带上时区，Instant 比 Clock 多了时间计算的功能。
         *
         *
         *
         */
        // Instant 与时区无关，即它使用的是 UTC 时间
        System.out.println(Instant.now()); // 相当于 Instant.ofEpochMilli(System.currentTimeMillis())
        System.out.println(Instant.MIN);


        // System.out.println(Instant.parse(LocalDateTime.now().toString() + "Z"));

        // System.out.println(Instant.now());
        // System.out.println(Instant.now(Clock.systemDefaultZone()));

        // System.out.println(LocalDateTime.now(Clock.systemUTC()));
        // System.out.println(LocalDateTime.now(Clock.systemDefaultZone()));

    }
}
