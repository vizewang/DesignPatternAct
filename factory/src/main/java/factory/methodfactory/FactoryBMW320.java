package factory.methodfactory;

/**
 * Created by weizwang on 2015/7/17.
 */
public class FactoryBMW320 implements FactoryBMW {
    public BMW320 createBMW() {
        return new BMW320();
    }
}
