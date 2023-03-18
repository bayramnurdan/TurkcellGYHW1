

import java.util.ArrayList;

public class Player extends Customer {
    private double score;
    private String nickName;


    public Player(String firstName, String lastName, String email, String password, String nationalIdentity, String birthYear, double balance, ArrayList<Purchasable> listOfItemsPurchased, double score, String nickName) {
        super(firstName, lastName, email, password, nationalIdentity, birthYear, balance, listOfItemsPurchased);
        this.score = score;
        this.nickName = nickName;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }


    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }







}
