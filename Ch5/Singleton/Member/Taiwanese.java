package design_pattern.Ch5.Singleton.Member;


public class Taiwanese extends Member {
    public  Taiwanese(String name){
        nationality = "Taiwanese";
        this.name = name;
        
        this.registered = false;
        System.out.println("I'm "+ name);
    }
}
