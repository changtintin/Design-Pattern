package Ch7.Java.StudentLoan.Contracts;

import java.util.ArrayList;

import Ch7.Java.StudentLoan.Loan.GeneralLoan;

public class UniversityLoan extends GeneralLoan {
    public int researchingLimitation;
    public int researchingFee;

    public UniversityLoan(){
        this.guarantorLimitation = 1;
        this.housingLimitation = 10000;
        this.researchingLimitation = 20000;
    }
    protected void guarantorRule(){
        System.out.println("One of your parent");
    }

    protected void housingRule(){
        System.out.println("Up to the highest student housing price");
    }

    protected void researchingFeeRule(){
        System.out.println("Get the apply form and permission of professor");
    }
   
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

    public void setResearchingFee(int num){
        if(num <= this.researchingLimitation){
            this.researchingFee = num;
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

    public  void showAllRules(){
        guarantorRule();
        housingRule();
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
        System.out.println("Researching: " + this.researchingFee);
        System.out.println("Guarantor: ");
        for (int i = 0; i < this.guarantors.size(); i++) {
            System.out.printf("%s ", guarantors.get(i));
        }
    };
}
