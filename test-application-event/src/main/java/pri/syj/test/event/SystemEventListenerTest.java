/**
 * 深圳玄羽科技有限公司 http://www.xuanyutech.net/ Copyright ©2020 XuanYuTech Inc. All rights reserved.
 */

package pri.syj.test.event;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @Title: SystemEventListenerTest
 * @Description:
 * @author: 玄羽1107
 * @create: 2020/3/26 20:15   
 * @version V1.0
 */
@Slf4j
@Component
public class SystemEventListenerTest implements ApplicationListener<ApplicationEvent> ,
    ApplicationRunner {

  @Override
  public void onApplicationEvent(ApplicationEvent applicationEvent) {
    log.info("Receive a application event,[{}].",applicationEvent.getClass().toString());
  }

  @Override
  public void run(ApplicationArguments args) throws Exception {
    log.info("Application runner has been execute.");
  }
}
