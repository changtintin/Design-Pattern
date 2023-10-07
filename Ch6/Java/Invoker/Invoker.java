package Ch6.Java.Invoker;
import Ch6.Java.Command.Command;

public abstract class Invoker {
    abstract public void setCommand(int btnNum, Command onCommand, Command offCommand);
}
