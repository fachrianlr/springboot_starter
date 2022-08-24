package com.rian.starter.cron;

import org.springframework.scheduling.annotation.Scheduled;


//@Component
public class CronJob {

    @Scheduled(fixedDelay=5000)
    public void resetTotalDailyRequest(){
        System.out.println("aaaaaaa");
    }
}
