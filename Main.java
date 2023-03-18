import entities.*;
import services.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<User> allUsers =  new ArrayList<>();
        ArrayList<Campaign> allCampaigns =  new ArrayList<>();
        ArrayList<Game> allGames = new ArrayList<>();
        ArrayList<Purchase> allPurchases = new ArrayList<>();

        UserManager userM  = new UserManager(allUsers);
        CampaignManager campaignM = new CampaignManager(allCampaigns);
        GameManager gameM =  new GameManager(allGames);
        SalesManager salesM  =new SalesManager(allPurchases);

        userM.register("Nurdan", "Emin", "nurdane","nurdanemin0@gmail.com",
                "123", "12345679", "1997");
        campaignM.add(new Campaign("Summer Sale", "50% discount until the end of summer", 50.0));
        campaignM.add(new Campaign("Student Sale", "only for undergrads",60.0));
        gameM.add(new Game("Java Snake", 50.0));

        Player newPlayer =  new Player("Nurdan", "Bayram", "nurdan@gmail.com", "123",
                "123387e023b", "1997",
                0.0, null, 0.0 ,"nemin");

        salesM.sell(newPlayer, gameM.getLib().get(0), campaignM.getLib().get(0));


        userM.printAll();
        gameM.printAll();
        campaignM.printAll();
        campaignM.remove(campaignM.getLib().get(0));
        campaignM.printAll();
        salesM.printAll();













    }
}