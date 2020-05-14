import java.io.*;
import java.util.*;
import java.util.ArrayList;

public class Bookstore {

    private ArrayList<String> titles;
    String name;
    String address;
    String opentoday;
    String closetime;
    String storesize;
    String books;
    String searcharray;
    int z = 0;
    int count;

    // This is the constructor of the class Bookstore
    public Bookstore(String name, String address) {
        this.name = name;
        this.address = address;
        titles = new ArrayList<String>();
        loadTitles();
    }

    private void loadTitles() {
        try {
            Utils.loadStringsToArray(this.titles);
        } catch (IOException e) {
            // for now simply init the array to zero
            System.out.println("Could not initilize the titles");
            // make sure it is empty
            this.titles = new ArrayList<String>();

        }
    }

    // Assign the today of the Bookstore to the variable opentoday.
    public void today(String today) {
        opentoday = today;
    }

    /* Assign the close to the variable closetime. */
    public void closingtime(String close) {
        closetime = close;
    }

    /* Assign the size to the variable storesize. */
    public void size(String size) {
        storesize = size;
    }

    /* Assign the oldnew to the variable books. */
    public void oldnew(String oldnew) {
        books = oldnew;
    }

    public void printarray() {
        for (z = 0; z < titles.size(); z++)

        {
            System.out.println(titles.get(z));
        }
    }

    /* Search titles */
    public void searchtitle(String sname) {
        System.out.println("We are searching the titles list for your search word : " + sname);
        for (z = 0; z < titles.size(); z++) {
            boolean ans = titles.get(z).contains(sname);
            if (ans) {
                System.out.println(titles.get(z));
                count++;
            }
        }
        if (count == 0) {
            System.out.println("We are Sorry, Try with another title!");
        }
    }

    /* Print the Bookstore details */
    public void printBookstore() {

        System.out.println("What is the address?:" + address);
        System.out.println("Is the store open today?:" + opentoday);
        System.out.println("What time does it close?:" + closetime);
        System.out.println("How big is the store?:" + storesize);
        System.out.println("Does the store have new or used books?:" + books);
    }

    // private ArrayList<String> Booktitles;
}