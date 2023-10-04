package design_pattern.Ch5.Singleton.Member;
import design_pattern.Ch5.Singleton.RegisterCenter.RegisterCenter;

abstract public class Member {
    public String name;
    public String nationality;
    boolean registered;    

    public void isRegistered(){
        this.registered = true;    
        System.out.println("I'm "+name+", a member of this shopping site from now on");
    }
}
