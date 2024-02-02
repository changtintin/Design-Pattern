package Ch7.Java.StudentLoan;

import java.util.ArrayList;

import Ch7.Java.StudentLoan.Contracts.HighSchoolLoan;
import Ch7.Java.StudentLoan.Loan.LoanAdapter;

public class Bank {
    public static void main(String[] args) {
        HighSchoolLoan firstContract = new HighSchoolLoan();
        firstContract.setSchoolInfo("Dong shan", 3, "none");
        firstContract.setPersonalInfo(1255312472, "Taichung Beitun District.", "Ting", "87.10.01", "student");
        ArrayList<String> guarantors =  new ArrayList<String>();
        guarantors.add("Hui");
        guarantors.add("Chung");
        firstContract.setGuarantor(guarantors);
        firstContract.setHousingFee(3600);
        firstContract.setTuition(12000);
        firstContract.showAllRules();
        firstContract.showAllInfo();

        System.out.println("\n--------------------\n");

        System.out.println("New Contract:");
        LoanAdapter universityNewContract = new LoanAdapter(firstContract); 
        universityNewContract.showAllRules();
        universityNewContract.setSchoolInfo("TNNUA", 1, "Apply Music");
        universityNewContract.setTuition(25000);
        guarantors.clear();
        guarantors.add("Pei");
        universityNewContract.setGuarantor(guarantors);
        universityNewContract.setHousingFee(8000);
        universityNewContract.setResearchingFee(3000);
        firstContract.showAllRules();
        universityNewContract.showAllInfo();
    }
}
