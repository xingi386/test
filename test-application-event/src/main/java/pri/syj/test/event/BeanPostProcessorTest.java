/**
 * 深圳玄羽科技有限公司 http://www.xuanyutech.net/ Copyright ©2020 XuanYuTech Inc. All rights reserved.
 */

package pri.syj.test.event;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * @Title: BeanPostProcessorTest
 * @Description:
 * @author: 玄羽1107
 * @create: 2020/3/26 20:52   
 * @version V1.0
 */
@Slf4j
@Component
public class BeanPostProcessorTest implements BeanPostProcessor {

  @Override
  public Object postProcessBeforeInitialization(Object bean, String beanName)
      throws BeansException {
      //log.info("postProcessBeforeInitialization:[{}]",beanName);
    return bean;
  }


  @Override
  public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
    log.info("postProcessAfterInitialization:[{}]",beanName);
    return bean;
  }
}
