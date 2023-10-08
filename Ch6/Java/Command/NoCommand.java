package Ch6.Java.Command;

public class NoCommand implements Command{
    public void execute(){
        System.out.println("The button hasn't been assign to any command.");
    }
    public void undo(){}
}
