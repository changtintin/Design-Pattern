package Ch7.Java.GroceryCheckout.Payment;

public class Card extends Payment{
    public String bank;
    protected String number;
    protected String csc;

    public Card(String bank, String number, String csc){
        this.bank = bank;
        this.number = number;
        this.csc = csc;               
        int len = this.number.length();
        String fourDigits = this.number.substring(len - 4, len);
        this.info = "\nPayment: Card"; 
        this.info += "\nCard number (last 4 digits): " + fourDigits;
    }
}
