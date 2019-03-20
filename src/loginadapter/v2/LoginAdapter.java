package loginadapter.v2;

import loginadapter.ResultMsg;

/**
 * Created by Administrator on 2019/3/20.
 */
public interface LoginAdapter {
    boolean support(Object adapter);
    ResultMsg Login(String id,Object adapter);
}
