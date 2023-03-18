

import java.util.ArrayList;

public class Customer extends User {
    private double balance;
    private ArrayList<Purchasable> listOfItemsPurchased;  //dynamic list to keep track of things that customer bought

    public Customer(String firstName, String lastName, String email, String password, String nationalIdentity, String birthYear, double balance, ArrayList<Purchasable> listOfItemsPurchased) {
        super(firstName, lastName, email, password, nationalIdentity, birthYear);
        this.balance = balance;
        this.listOfItemsPurchased = listOfItemsPurchased;
    }

    public double getBalance() {
        return balance;
    }


    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void decreaseBalance(double amount){
        this.balance -= amount;
    }


    public ArrayList<Purchasable> getListOfItemsPurchased() {
        return listOfItemsPurchased;
    }

    public void setListOfItemsPurchased(ArrayList<Purchasable> listOfItemsPurchased) {
        this.listOfItemsPurchased = listOfItemsPurchased;
    }
}
