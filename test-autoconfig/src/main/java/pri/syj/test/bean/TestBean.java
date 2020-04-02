package pri.syj.test.bean; /**
 * 深圳玄羽科技有限公司 http://www.xuanyutech.net/ Copyright ©2020 XuanYuTech Inc. All rights reserved.
 */

import lombok.Data;

/**
 * @Title: pri.syj.test.bean.TestBean
 * @Description:
 * @author: 玄羽1107
 * @create: 2020/3/26 15:46   
 * @version V1.0
 */
@Data
public class TestBean {

  private String name ;
  private String describe ;

  public TestBean(String name , String describe){
    this.name = name ;
    this.describe = describe ;
  }

}
