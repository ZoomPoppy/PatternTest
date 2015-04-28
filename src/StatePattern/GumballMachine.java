package StatePattern;

/**
 * Created by zz on 2015/4/28.
 */
public class GumballMachine {
    final static int SOLD_OUT = 0;
    final static int NO_QUATER = 1;
    final static int HAS_QUATER = 2;
    final static int SOLD = 3;

    int state = SOLD_OUT;
    int count = 0;

    public GumballMachine(int count){
        this.count = count;
        if (count>0){
            state = NO_QUATER;
        }
    }

    public void insertQuarter(){
        if (state == HAS_QUATER){
            System.out.println("You can't insert another quarter");
        }
        else if (state == NO_QUATER){
            state = HAS_QUATER;
            System.out.println("You inserted a quarter");
        }
        else if (state == SOLD_OUT){
            System.out.println("You can't insert a quater,the machine is sold out ");
        }
        else if (state == SOLD){
            System.out.println("Please wait,we're aleady giving you a gumball");
        }
    }
    //顾客试着返回25分钱
    public void ejectQuater(){
        if(state == HAS_QUATER){
            System.out.println("Quarter returned ");
            state = NO_QUATER;
        }
        else if (state == NO_QUATER){
            System.out.println("You haven't inserted a quarter");
        }
        else if (state == SOLD){
            System.out.println("Sorry ,you already turn the canrk");
        }
        else if (state == SOLD_OUT){
            System.out.println("you can't eject,you haven't inserted a quarter yet");
        }
    }
    public void turnCrank(){
        if (state == SOLD){
            System.out.println("Turning twice doesn't get you another gumball");
        }
        else if (state == NO_QUATER){
            System.out.println("you turned but there's no quarter");
        }
        else if (state == HAS_QUATER){
            System.out.println("You turned...");
            state = SOLD;
           dispense();

        }
        else if(state == SOLD_OUT){
            System.out.println("No gumball dispensed");
        }
    }
    public void dispense(){
        if (state == SOLD){
            System.out.println("A gumball comes rolling out the slot");
            count = count - 1;
            if (count == 0){
                System.out.println("Ooops,out of gumballs");
                state = SOLD_OUT;
            }
            else {
                state = NO_QUATER;
            }
        }
        else if(state == NO_QUATER){
            System.out.print("You need to pay first");
        }
        else if (state == SOLD_OUT){
            System.out.println("No gumball dispensed");
        }
        else if (state == HAS_QUATER){
            System.out.println("No gumballs dispensed");
        }

    }
    public void refill(int count){
        this.count += count;
    }
    public String toString(){
        int Inventory = count;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("\n");
        stringBuffer.append(this.getClass().getName());
        stringBuffer.append("\n");
        stringBuffer.append("Invertory:"+ count);
        stringBuffer.append("\n");
        if (state == NO_QUATER){
            stringBuffer.append("Machine is waiting for quarter");
            stringBuffer.append("\n");

        }
        if (count== 0){
            stringBuffer.append("Machine is sold out");
            stringBuffer.append("\n");
        }
        if (state == HAS_QUATER){
            stringBuffer.append("Machine is waiting you to turn crank");
            stringBuffer.append("\n");
        }

        return stringBuffer.toString();
    }
}
