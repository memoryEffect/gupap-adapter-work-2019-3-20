package loginadapter.v2;

import loginadapter.ResultMsg;

/**
 * Created by Administrator on 2019/3/20.
 */
public class LoginForQQAdapter implements LoginAdapter {
    @Override
    public boolean support(Object adapter) {
        return adapter instanceof LoginForQQAdapter;
    }

    @Override
    public ResultMsg Login(String id, Object adapter) {
        return null;
    }
}
