package design_pattern.Ch5.Singleton.RegisterCenter;
import design_pattern.Ch5.Singleton.Member.Member;
import java.util.ArrayList;


public class RegisterCenter {
    private static RegisterCenter registerCenter;
    protected ArrayList<Member> members = new ArrayList<Member>();
    private RegisterCenter(){}
    
    protected void setMember(Member member){
        members.add(member);
    }

    protected void getMembers(){
        System.out.print("Member List: ");
        for (int i = 0; i < members.size(); i++) {
            System.out.print(members.get(i).name + " ");
        }
        System.out.print("\n");
    }

    public static synchronized RegisterCenter getInstance(){
        if(registerCenter == null){
            registerCenter = new RegisterCenter();            
        }
        return registerCenter;   
    }

    public void registProcess(Member member){
        try {
            System.out.println("System:  Working on "+member.name+"'s registration.....");  
            Thread.sleep(500);
            System.out.println("System:  member "+member.name+" register successful\n");  
            setMember(member);
            getMembers();

        } catch (Exception e) {
           System.out.println(e);
        }
    }
}
