/**
 * 深圳玄羽科技有限公司 http://www.xuanyutech.net/ Copyright ©2020 XuanYuTech Inc. All rights reserved.
 */

package pri.syj.test.sampleapp;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pri.syj.test.bean.TestBean;

/**
 * @Title: AutoConfigTestController
 * @Description:
 * @author: 玄羽1107
 * @create: 2020/3/26 15:52   
 * @version V1.0
 */
@RestController
@Slf4j
public class AutoConfigTestController {

  @Autowired
  private TestBean testBean ;

  @RequestMapping("/getname")
  public  String getName(){
    log.info("Auto Config test , name:{},describe:{}",testBean.getName(),testBean.getDescribe());
    return testBean.getName();
  }

}
