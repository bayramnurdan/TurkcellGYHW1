package services;

import java.util.ArrayList;
import java.util.Arrays;

public class Manager<T> {  // can be any type of manager. Keeps related data it is responsible for and make actions
                                            // such as adding deleting related data
    private final ArrayList<T> lib;


    public Manager(ArrayList<T> lib) {
        this.lib = lib;
    }


    public ArrayList<T> getLib() {
        return lib;
    }

    public void add(T item) {

        this.lib.add(item);

    }

    public void addMany(T[] items) {
        this.lib.addAll(Arrays.asList(items));

    }

    public void remove(T item) {
        this.lib.remove(item);
    }

    public void removeMany(T[] items) {
        for (T item : items) {

            this.lib.remove(item);
        }

    }
    public void printAll(){
        for(int i = 0; i < lib.size(); i++) {
            System.out.print(lib.get(i) + "   ");
        }
        System.out.println();


    }
}

