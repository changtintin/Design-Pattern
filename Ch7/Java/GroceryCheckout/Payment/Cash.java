package Ch7.Java.GroceryCheckout.Payment;

public class Cash extends Payment{
    public int paidPayment;
    public int change;

    public  Cash(int paidPayment, int cost){
        this.paidPayment = paidPayment;
        change = paidPayment - cost;
        this.info = "\nPayment: Cash";
        this.info += "\nPaid: $" + paidPayment;
        this.info += "\nReturn $" + change;
    }
}
