package loginadapter.v2;

/**
 * Created by Administrator on 2019/3/20.
 */
public class PassportTest {
    public static void main(String[] args) {
        IPassportForThird passportForThird = new PassportForThirdAdapter();
        passportForThird.loginForQQ("");
    }
}
