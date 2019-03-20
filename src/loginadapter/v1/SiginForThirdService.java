package loginadapter.v1;

import com.sun.org.apache.regexp.internal.RE;
import loginadapter.ResultMsg;
import loginadapter.SiginService;

/**
 * Created by Administrator on 2019/3/20.
 * 稳定的方法继承下来
 */
public class SiginForThirdService extends SiginService {
        public ResultMsg loginForQQ(String openId){
            //1、openId是全局唯一，我们可以把它当做是一个用户名（加长）
            //2、密码默认为QQ_EMPTY
            //3、注册（在原有系统里面创建一个用户）
            //4、调用原来的登录方法

            return loginForRegist(openId,null);
        }

    public ResultMsg loginForWechat(String openId){
        return null;
    }

    public ResultMsg loginForToken(String token){
        //通过token拿到用户信息，然后再重新登陆一次
        return null;
    }

    public ResultMsg loginForTelphone(String telphone,String code){
        return null;
    }
    private ResultMsg loginForRegist(String username, String  password) {
        super.regist(username,null);
        return super.login(username,null);
    }
}
