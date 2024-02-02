package Ch7.Java.GroceryCheckout.Receipt;

import java.util.ArrayList;
import Ch7.Java.GroceryCheckout.Item.Item;

/**
 * Receipt
 */
public class Receipt {
    public ArrayList<Item> items;
    public boolean eReceipt;
    protected String content;

    public Receipt(ArrayList<Item> cart, int total, String paymentInfo){        
        items = cart;
        content = "===== RECEIPT =====";
        content += "\nItems: \n";
        for (Item item : items) {
            content += item.name;
            content += " $" + item.price + "\n";
        }
        content += "\nTotal: " + total;
        content += paymentInfo;
    }

    public void showContent(){
        System.out.println(content);
        if(eReceipt){
            System.out.println("Check more info online.");
        }
    }

    public void eReceiptOrNot(boolean option){       
        if(option){
            this.eReceipt = true;
        }
        else{
            this.eReceipt = false;
        }
    }
}