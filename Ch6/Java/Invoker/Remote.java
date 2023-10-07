package Ch6.Java.Invoker;

import java.util.ArrayList;
import Ch6.Java.Command.Command;

public class Remote extends Invoker{
    ArrayList<Command> onCommands;
    ArrayList<Command> offCommands;

    public Remote(){
        onCommands = new ArrayList<Command>(8);
        offCommands = new ArrayList<Command>(8);
    }

    public void setCommand(int btnVal, Command onCommand, Command offCommand){
        onCommands.add(btnVal - 1, onCommand);
        offCommands.add(btnVal - 1, offCommand);        
    }

    public void pressOnBtn(int btnVal){
        onCommands.get(btnVal - 1).execute();
    }

    public void pressOffBtn(int btnVal){
        offCommands.get(btnVal - 1).execute();
    }
}
