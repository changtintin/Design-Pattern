package Ch7.Java.StudentLoan.Loan;

import java.util.ArrayList;

public abstract class GeneralLoan{
    public String major;
    public int grade;
    public String school;
    
    public ArrayList<String> guarantors;
    public int housingFee;
    public int tuition;
    public int housingLimitation;
    public int guarantorLimitation;

    public String adr;
    public String birthday;
    public String career;
    public int id;
    public String name;

    public abstract void showAllRules();
    public abstract void showAllInfo();
    public abstract void setGuarantor(ArrayList<String> names);
    public abstract void setHousingFee(int num);
    public abstract void setTuition(int num);
    public abstract void setSchoolInfo(String school, int grade, String major);
    public abstract void setPersonalInfo(int id, String adr, String name, String birthday, String career);
}
