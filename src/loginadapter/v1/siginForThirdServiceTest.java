package loginadapter.v1;

/**
 * Created by Administrator on 2019/3/20.
 */
public class siginForThirdServiceTest {


    public static void main(String[] args) {
        SiginForThirdService siginForThirdService = new SiginForThirdService();

        //不改变原来的代码，也要能够兼容新的需求
        //还可以再加一层策略模式

        siginForThirdService.loginForQQ("asdsaddsadadas");
    }
}
