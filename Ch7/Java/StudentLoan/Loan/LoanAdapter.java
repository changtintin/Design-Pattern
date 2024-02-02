package Ch7.Java.StudentLoan.Loan;

import java.util.ArrayList;

import Ch7.Java.StudentLoan.Contracts.HighSchoolLoan;
import Ch7.Java.StudentLoan.Contracts.UniversityLoan;

public class LoanAdapter {
    public HighSchoolLoan highSchoolLoan;
    public UniversityLoan universityLoan;

    public LoanAdapter(HighSchoolLoan highSchoolLoan){
        this.highSchoolLoan = highSchoolLoan;
        this.universityLoan = new UniversityLoan();
        this.universityLoan.setPersonalInfo(highSchoolLoan.id, highSchoolLoan.adr, highSchoolLoan.name, highSchoolLoan.birthday, highSchoolLoan.career);
    }

    public void showAllInfo(){
        this.universityLoan.showAllInfo();
    }

    public void showAllRules(){
        this.universityLoan.showAllRules();
    }

    public void setSchoolInfo(String school, int grade, String major){
        this.universityLoan.setSchoolInfo(school, grade, major);
    }

     public void setGuarantor(ArrayList<String> names){
        if(names.size() == this.universityLoan.guarantorLimitation){
            this.universityLoan.guarantors = names;
        }
    }

    public void setHousingFee(int num){
        if(num <= this.universityLoan.housingFee){
            this.universityLoan.housingFee = num;
        }        
    };

    public void setResearchingFee(int num){
        if(num <= this.universityLoan.researchingLimitation){
            this.universityLoan.researchingFee = num;
        }        
    };

    public void setTuition(int num){
        this.universityLoan.tuition = num;
    }
}
