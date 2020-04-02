package pri.syj.test.autoconfig; /**
 * 深圳玄羽科技有限公司 http://www.xuanyutech.net/ Copyright ©2020 XuanYuTech Inc. All rights reserved.
 */

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pri.syj.test.bean.TestBean;

/**
 * @Title: AutoConfigurationTest
 * @Description:
 * @author: 玄羽1107
 * @create: 2020/3/26 15:42   
 * @version V1.0
 */
@Configuration
@Data
@EnableConfigurationProperties(ConfigProperties.class)
@ConditionalOnClass(TestBean.class)
public class AutoConfigure {

  @Autowired
  private ConfigProperties props ;

  @Bean
  @ConditionalOnMissingBean
  public TestBean getTestBean(){
    return new TestBean(props.getName(),props.getDescribe());
  }


}
