package services;
import entities.*;

import java.util.ArrayList;

public class SalesManager extends Manager<Purchase> {


    public SalesManager(ArrayList<Purchase> lib) {
        super(lib);
    }

    public void sell(Customer customer, Purchasable item, Campaign campaign){
        if (campaign != null && campaign.getAppliedToThings().contains(item)){
            double discounted_price = item.hasPrice()* campaign.getAmountOfDiscountInPercentage()/100;
            customer.decreaseBalance(discounted_price);
            Purchase newPurchase =  new Purchase(customer, item, discounted_price);
            add(newPurchase);
        }else{
            customer.decreaseBalance(item.hasPrice());
            Purchase newPurchase = new Purchase(customer, item, item.hasPrice());
            add(newPurchase);

        }



    }



}
