package StatePatternAndProxyPattern;

import java.io.Serializable;

/**
 * Created by zz on 2015/4/28.
 */
public interface State extends Serializable {
    public void insertQuarter();
    public void ejectQuater();
    public void turnCrank();
    public void dispense();

}
