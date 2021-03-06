package objectadapter;

/**
 * Created by Administrator on 2019/3/20.
 */
public class PowerAdapter implements DC5 {
    private AC220 ac220;

    public PowerAdapter(AC220 ac220){
        this.ac220= ac220;
    }

    @Override
    public int outputDC5V() {
        int adapterInput=ac220.outputAC220();

        //变压器
        int adapterOutput = adapterInput/44;
        System.out.println("使用 PowerAdapter 输入 AC:"+adapterInput+"V"+"输出DC:"+adapterOutput+"V");

        return adapterOutput;
    }
}
