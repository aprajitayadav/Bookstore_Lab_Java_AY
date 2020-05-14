import java.io.*;
import java.util.*;
import java.util.ArrayList;

public class BookstoreTest {
    public static void main(String args[]) {

        String sname = "";
        // private ArrayList<String> titles;
        /* Create two objects using constructor */
        System.out.println("Hello and welcome to Scholar's bookstore!!!");
        Bookstore bookOne = new Bookstore("12345 Scholistic Dr.", "Ballantyne, Charlotte, NC 28277");
        // Invoking methods for each object created
        bookOne.today(" Yes, Bookstore is open today.");
        bookOne.closingtime(" 8:00pm EST.");
        bookOne.size(" 1000 sqft.");
        bookOne.oldnew(" Store carries both New and Old books.");
        bookOne.printBookstore();
        bookOne.printarray();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the title for search!");
        sname = scanner.next();
        bookOne.searchtitle(sname);

    }
}
