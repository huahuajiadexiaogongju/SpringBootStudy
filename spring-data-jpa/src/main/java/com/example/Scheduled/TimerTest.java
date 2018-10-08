package com.example.Scheduled;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * 使用Timer
 */
public class TimerTest {
    public static void main(String[] args) {
        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
//                System.out.println("task  run:"+ new Date());
                LocalDateTime time = LocalDateTime.now();
                String timeString = time.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
                System.out.println("task run:" + timeString);
            }
        };
        Timer timer = new Timer();
        //安排指定的任务在指定的时间开始进行重复的固定延迟执行。这里是每3秒执行一次
        //定时任务3秒后执行，每1秒执行一次
        timer.schedule(timerTask,3000,1000);
    }
}
