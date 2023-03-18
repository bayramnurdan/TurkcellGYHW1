package services;

import entities.User;

import java.util.ArrayList;

public class UserManager extends Manager<User> {


    public UserManager(ArrayList<User> lib) {
        super(lib);
    }

    public boolean verifyUser(String firstName, String lastName, String nationalIdentity, String birthYear) {
        System.out.println("User is being verified");
        return true;
    }

    public void register(String firstName, String lastName, String nickName, String email, String password, String nationalIdentity, String birthYear) {
        if (verifyUser(firstName, lastName, nationalIdentity, birthYear)) {
            User newUser = new User(firstName,lastName, email, password, nationalIdentity, birthYear);
            add(newUser);
            System.out.println("User was verified and registered.");
        } else {
            System.out.println("Sorry, verification failed");

        }
    }
}

