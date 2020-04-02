/**
 * 深圳玄羽科技有限公司 http://www.xuanyutech.net/ Copyright ©2020 XuanYuTech Inc. All rights reserved.
 */

package pri.syj.test.scheduling;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @Title: FixOutputTestMain
 * @Description:
 * @author: 玄羽1107
 * @create: 2020/3/24 19:55   
 * @version V1.0
 */
@SpringBootApplication
@EnableScheduling
public class SchedulingTestMain {

  public static void main(String[] args) {
    SpringApplication.run(SchedulingTestMain.class,args);
  }

}
