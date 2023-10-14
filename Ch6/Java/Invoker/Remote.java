package Ch6.Java.Invoker;

import java.util.ArrayList;
import java.util.Collections;
import Ch6.Java.Command.Command;
import Ch6.Java.Command.NoCommand;

public class Remote extends Invoker{
    ArrayList<Command> onCommands;
    ArrayList<Command> offCommands;
    Command undoCommand;
    
    public Remote(){
        NoCommand noCommand = new NoCommand();
        onCommands = new ArrayList<Command>(Collections.nCopies(8, noCommand));
        offCommands = new ArrayList<Command>(Collections.nCopies(8, noCommand));
        undoCommand = new NoCommand();
    }

    public void setCommand(int btnVal, Command onCommand, Command offCommand){
        onCommands.set(btnVal - 1, onCommand);
        offCommands.set(btnVal - 1, offCommand);  
    }

    public void pressOnBtn(int btnVal){     
        System.out.print(this.toString(btnVal, "ON"));   
        onCommands.get(btnVal - 1).execute();   
        undoCommand = onCommands.get(btnVal - 1);
    }

    public void pressOffBtn(int btnVal){        
        System.out.print(this.toString(btnVal, "OFF"));  
        offCommands.get(btnVal - 1).execute();    
        undoCommand = offCommands.get(btnVal - 1);
    }

    public void pressUndoBtn(){
        System.out.print(this.toString(0, "UNDO"));  
        onCommands.get(7).execute();   
        undoCommand.undo();
    }

    @Override
    public String toString() {
        StringBuffer stringBuf = new StringBuffer();
        stringBuf.append("\n_________________   Remote Control   _________________\n\n");
        for(int i = 0; i < onCommands.size() - 1; i++){
            stringBuf.append("[ SLOT "+ (i + 1) + "] " + onCommands.get(i).getClass().getName());
            stringBuf.append("    " + "[ SLOT " + (i + 1) + "] " + offCommands.get(i).getClass().getName() + "\n");
        }
        stringBuf.append("[ SLOT " + (onCommands.size()) + "] " + undoCommand.getClass().getName() + " -> " + "UNDO \n");
        return stringBuf.toString();
    }

    public String toString(int btnVal, String func){
        return "Press " + func + " button " + btnVal + " -> ";
    }
}
