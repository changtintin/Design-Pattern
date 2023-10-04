package design_pattern.Ch5.Singleton;
import design_pattern.Ch5.Singleton.Member.*;
import design_pattern.Ch5.Singleton.RegisterCenter.RegisterCenter;

public class Singleton {
    public static void main(String[] args) {
        RegisterCenter rc = RegisterCenter.getInstance();
        Member Takuto = new Japanese("Takuto");
        Member Ting = new Taiwanese("Ting");
        Member Lin = new Taiwanese("Lin");
        
        RegisterCenter japanRegisterCenter = RegisterCenter.getInstance();
        japanRegisterCenter.registProcess(Takuto);
        
        // Maybe more other user register at the same time
        RegisterCenter taiwaRegisterCenter = RegisterCenter.getInstance();
        taiwaRegisterCenter.registProcess(Ting);
        taiwaRegisterCenter.registProcess(Lin);

    } 
}
