/**
 * 深圳玄羽科技有限公司 http://www.xuanyutech.net/ Copyright ©2020 XuanYuTech Inc. All rights reserved.
 */

package pri.syj.test.scheduling;

import java.util.concurrent.Executors;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.SchedulingConfigurer;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;
import org.springframework.scheduling.config.ScheduledTaskRegistrar;

/**
 * @Title: SchedulingThreadPoolTest
 * @Description:
 * @author: 玄羽1107
 * @create: 2020/3/24 20:15   
 * @version V1.0
 */
@Configuration
public class SchedulingThreadPoolTest implements SchedulingConfigurer {

  @Override
  public void configureTasks(ScheduledTaskRegistrar scheduledTaskRegistrar) {

    //spring 线程池
    scheduledTaskRegistrar.setScheduler(getScheduler());
    //java 原生线程池
    //scheduledTaskRegistrar.setScheduler(Executors.newScheduledThreadPool(20));
  }

  //destroyMethod="shutdown"要有
  @Bean(destroyMethod="shutdown")
  public ThreadPoolTaskScheduler getScheduler(){
    ThreadPoolTaskScheduler sheduler = new ThreadPoolTaskScheduler();
    sheduler.setPoolSize(5);
    sheduler.setThreadNamePrefix("task-");
    sheduler.setWaitForTasksToCompleteOnShutdown(true);
    sheduler.setAwaitTerminationSeconds(60);
    return sheduler;
  }

}
