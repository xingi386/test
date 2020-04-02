/**
 * 深圳玄羽科技有限公司 http://www.xuanyutech.net/ Copyright ©2020 XuanYuTech Inc. All rights reserved.
 */

package pri.syj.test.scheduling;

import java.util.Date;
import java.util.concurrent.atomic.AtomicInteger;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.PropertySource;
import org.springframework.scheduling.TriggerContext;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.scheduling.annotation.SchedulingConfigurer;
import org.springframework.scheduling.config.ScheduledTaskRegistrar;
import org.springframework.scheduling.support.CronTrigger;
import org.springframework.stereotype.Component;

/**
 * @Title: CronTaskTest
 * @Description:
 * @author: 玄羽1107
 * @create: 2020/3/24 19:59   
 * @version V1.0
 */
@Component
@PropertySource("classpath:scheduling-task.properties")
@Slf4j
public class CronTaskTest implements SchedulingConfigurer {

  //@Scheduled(cron="0/1 * * * * *")
  public void fixCronTest(){
    log.info("fix cron string test ,{} .",new Date());
  }


  //@Scheduled(cron = "${pri.syj.test.shceduling.cronTest.cronFromProperties}")
  public void cronFromPropertiesTest(){
    log.info("configurable cron string from properties ,{} ",new Date());
  }

  private AtomicInteger taskExecuteTime = new AtomicInteger(0);
  private AtomicInteger getCronExpressTime = new AtomicInteger(0);


  @Override
  public void configureTasks(ScheduledTaskRegistrar scheduledTaskRegistrar) {
      scheduledTaskRegistrar.addTriggerTask(
          ()->{
              log.info("trigger task has been execute {} at {}",taskExecuteTime.incrementAndGet(),new Date());
          },
          /* 每次运行前首先调用trigger接口，获取下次执行时间
           * 每次运行后，再次调用trigger接口，获取下次执行时间
           */
          (TriggerContext triggerContext)->{
            CronTrigger cronTrigger = new CronTrigger(getDynamicCronExpress());
              Date nextTIme =  cronTrigger.nextExecutionTime(triggerContext) ;
              log.info("Next execute time is [{}]",nextTIme);
              return nextTIme ;
          }
      );
  }
  private String getDynamicCronExpress(){
      String cronString = String.format("0/%d * * * * *",getCronExpressTime.incrementAndGet());
      log.info("getDynamicCronExpress[{}] has been called {} at {}",cronString,getCronExpressTime.get(), new Date());
      return cronString ;
  }
}
