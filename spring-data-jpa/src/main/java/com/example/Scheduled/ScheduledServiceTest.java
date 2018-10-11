//package com.example.Scheduled;
//
//import lombok.extern.slf4j.Slf4j;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.scheduling.annotation.Async;
//import org.springframework.scheduling.annotation.Scheduled;
//import org.springframework.stereotype.Component;
//
//@Slf4j
//@Component
//@Async
//public class ScheduledServiceTest {
//    private templates final Logger log = LoggerFactory.getLogger(ScheduledServiceTest.class);
//    @Scheduled(cron = "0/5 * * * * *")
//    public void scheduled(){
//        log.info("=====>>>>>使用cron  {}",System.currentTimeMillis());
//    }
//    @Scheduled(fixedRate = 5000)
//    public void scheduled1() {
//        log.info("=====>>>>>使用fixedRate{}", System.currentTimeMillis());
//    }
//    @Scheduled(fixedDelay = 5000)
//    public void scheduled2() {
//        log.info("=====>>>>>fixedDelay{}",System.currentTimeMillis());
//    }
//}
