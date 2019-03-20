package loginadapter.v2;

import loginadapter.ResultMsg;
import loginadapter.SiginService;

/**
 * Created by Administrator on 2019/3/20.
 * 第三方登陆自由适配
 */
public class PassportForThirdAdapter extends SiginService implements IPassportForThird{
    @Override
    public ResultMsg loginForQQ(String id) {
        return null;
    }

    @Override
    public ResultMsg loginForWechat(String id) {
        return null;
    }

    //这里用到了简单工厂模式及策略模式

    private ResultMsg processLogin(String key,Class<? extends LoginAdapter> clazz){
        try {
            LoginAdapter adapter = clazz.newInstance();
            if(adapter.support(adapter)){
                return adapter.Login(key,adapter);
            }else{
                return  null;
            }

        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }
}
