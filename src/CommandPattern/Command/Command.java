package CommandPattern.Command;

/**
 * Created by zz on 2015/4/19.
 */
public interface Command {
   static String s = "a";
    public void execute();
    public void undo();
}
