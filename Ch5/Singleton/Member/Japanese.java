package design_pattern.Ch5.Singleton.Member;


public class Japanese extends Member {
    public  Japanese(String name){
        nationality = "Japanese";
        this.name = name;
        this.registered = false;
        System.out.println("I'm "+ name);
        
       
    }
}
