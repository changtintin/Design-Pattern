package Ch7.Java.StudentLoan.Contracts;

import java.util.ArrayList;
import Ch7.Java.StudentLoan.Loan.GeneralLoan;

public class HighSchoolLoan extends GeneralLoan{
    public HighSchoolLoan(){
        this.guarantorLimitation = 2;
        this.housingLimitation = 6000;
    }

    protected void guarantorRule(){
        System.out.println("Both of your parents");
    }

    protected void housingRule(){
        this.housingLimitation = 7000;
        System.out.println("Not greater than NT$" + this.housingLimitation);
    }

    public  void showAllRules(){
        guarantorRule();
        housingRule();
    };

    public void setGuarantor(ArrayList<String> names){
        if(names.size() == this.guarantorLimitation){
            this.guarantors = names;
        }
    }

    public void setHousingFee(int num){
        if(num <= this.housingFee){
            this.housingFee = num;
        }        
    };

    public void setTuition(int num){
        this.tuition = num;
    }

    public void setSchoolInfo(String school, int grade, String major){
        this.school = school;
        this.grade = grade;
        this.major = major;
    };

    public void setPersonalInfo(int id, String adr, String name, String birthday, String career){
        this.id = id;
        this.adr = adr;
        this.name = name;
        this.birthday = birthday;
        this.career = career;
    };

    public  void showAllInfo(){
        System.out.println("Personal Info:");
        System.out.println("Name: " + this.name);
        System.out.println("Id: " + this.id);
        System.out.println("Birthday: " + this.birthday);
        System.out.println("Career: " + this.career);
        System.out.println("Address: " + this.adr);

        System.out.println("School Info:");
        System.out.println("School: " + this.school);
        System.out.println("Grade: " + this.grade);
        System.out.println("Major: " + this.major);

        System.out.println("Apply Info:");
        System.out.println("Tuition: " + this.tuition);
        System.out.println("Housing: " + this.housingFee);
        System.out.println("Guarantor: " + this.housingFee);
        for (int i = 0; i < this.guarantors.size(); i++) {
            System.out.printf("%s ", guarantors.get(i));
        }

    };
}
