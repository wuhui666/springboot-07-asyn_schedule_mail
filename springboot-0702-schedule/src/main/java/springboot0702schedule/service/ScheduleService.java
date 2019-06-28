package springboot0702schedule.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

/**
 * @author: wuhui
 * @time: 2019/6/28 17:28
 * @desc:
 *
 * schedule rule:
 * 【0 0/5 14,18 * * ？】每天14点整，和18点整，每隔5分钟执行一次
 * 【0 15 10 ？* 1-6 】每个月的周一至周六10:15分执行一次
 * 【0 0 2 ？* 6L 】每个月的最后一个周六凌晨2点执行一次
 * 【0 0 2 LW * ？】每个月的最后一个工作日凌晨2点执行一次
 * 【0 0 2-4 ？* 1#1】每个月的第一个周一凌晨2点到4点期间，每个整点都执行一次;
 */
@Service
public class ScheduleService {
    @Scheduled(cron = "0/3 * * * * *")
    public void scheduleTask(){
        System.out.println("scheduleTask.....");
    }
    @Scheduled(cron = "2 * * * * *")
    public void scheduleTask2(){
        System.out.println("scheduleTask2222.....");
    }
}
