package loginadapter.v2;

import loginadapter.ResultMsg;

/**
 * Created by Administrator on 2019/3/20.
 * 第三方登陆兼容接口
 */
public interface IPassportForThird {
    /**
     * QQ登陆
     * @param id
     * @return
     */
    ResultMsg loginForQQ(String id);

    /**
     * 微信登陆
     * @param id
     * @return
     */
    ResultMsg loginForWechat(String id);

}
