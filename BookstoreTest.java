import java.io.*;
import java.util.*;
import java.util.ArrayList;

public class BookstoreTest {
    public static void main(String args[]) {

        String sname = "";
        Integer total = 0;
        String resp = "";
        // private ArrayList<String> titles;
        /* Create two objects using constructor */
        System.out.println("Hello and welcome to Scholar's bookstore!!!");
        Bookstore bookOne = new Bookstore("Scholar", "12345 Scholistic Dr Ballantyne NC 28277");
        // Invoking methods for each object created
        bookOne.today(" Yes, Bookstore is open today.");
        bookOne.closingtime(" 8:00pm EST.");
        bookOne.size(" 1000 sqft.");
        bookOne.oldnew(" Store carries both New and Old books.");
        bookOne.printBookstore();
        bookOne.printarray();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you want to know the total number of books store has?");
        resp = scanner.next();
        total = bookOne.gettotal(resp);
        System.out.println("Total number of book's in the store are : " + total);
        sname = bookOne.getname();
        System.out.println("Store name is : " + sname);
        System.out.println("Enter new store name for updates : ");
        sname = scanner.next();
        bookOne.setname(sname);
        bookOne.getname();
        System.out.println("Updated store name is : " + sname);

        System.out.println("Please enter the title for search!");
        sname = scanner.next();
        bookOne.searchtitle(sname);

    }
}
