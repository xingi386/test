package pri.syj.test.autoconfig; /**
 * 深圳玄羽科技有限公司 http://www.xuanyutech.net/ Copyright ©2020 XuanYuTech Inc. All rights reserved.
 */

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @Title: ConfigProperties
 * @Description:
 * @author: 玄羽1107
 * @create: 2020/3/26 15:37   
 * @version V1.0
 */
@Data
@ConfigurationProperties(prefix = "test")
public class ConfigProperties {

  private String name ;
  private String describe ;

}
