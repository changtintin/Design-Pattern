package Ch7.Java.GroceryCheckout;

import java.util.ArrayList;
import Ch7.Java.GroceryCheckout.Item.Item;
import Ch7.Java.GroceryCheckout.Payment.Card;
import Ch7.Java.GroceryCheckout.Payment.Cash;
import Ch7.Java.GroceryCheckout.Payment.Payment;
import Ch7.Java.GroceryCheckout.Receipt.Receipt;

public class Checkout {
    protected int total;
    public Receipt receipt;
    protected Payment payment;
    public ArrayList<Item> cart;

    public int getTotal(ArrayList<Item> items){
        for(int i = 0; i < items.size(); i++){
            this.total += items.get(i).price;
        }
        return total;
    }
    public static void main(String args[]){
        Checkout checkout = new Checkout();
        checkout.cart = new ArrayList<Item>();

        Item oranges = new Item("Heirloom Navel Oranges", 125);
        Item frozenFries = new Item("McCain Extra Crispy Classic Fries", 399);
        Item milk = new Item("Shamrock Farms Vitamin D Whole Milk", 169);
        Item rib = new Item("Barbecue Sauce & 6 Boneless Rib-Shaped Patties", 1499);
        Item toner = new Item("Garnier SKINACTIVE Micellar Cleansing Water", 125);
        Item oatMeal = new Item("Organic Apple Cinnamon Instant Oatmeal Packets", 99);

        checkout.cart.add(oranges);
        checkout.cart.add(frozenFries);
        checkout.cart.add(milk);
        checkout.cart.add(rib);
        checkout.cart.add(toner);
        checkout.cart.add(oatMeal);

        int total = checkout.getTotal(checkout.cart);
        checkout.payment = new Cash(4200, total);

        if(checkout.payment != null){
            String paymentInfo = checkout.payment.getPaymentInfo();
            Receipt receipt = new Receipt(checkout.cart, total, paymentInfo);
            receipt.eReceipt = true;
            receipt.showContent();
        }
        else{
            System.out.println("You haven't pay the bill.");
        }       
    }
}
