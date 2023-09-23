package swing;
import java.util.Random;

public class Button {
    private Listener role;

    public void makeDecision(int r){
        if(r % 2 == 0){            
           role = new Angel();
        }
        else{
            role = new Devil(); 
        }
    } 

    public void pressBtn() {
        System.out.println("Should I do it?");

        Random rand = new Random();
        int randNum = rand.nextInt(100);

        makeDecision(randNum);
        role.getOpinion();
    }
}
