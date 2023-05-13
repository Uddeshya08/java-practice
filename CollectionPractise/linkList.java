package CollectionPractise;

import java.util.Iterator;
import java.util.LinkedList;

public class linkList {

    public static void main(String[] args) {
        LinkedList ll=new LinkedList();

        ll.add("India");
        ll.add("NewZealand");
        ll.add("England");

        Iterator it =ll.descendingIterator(); //reverse string using iterator

        while (it.hasNext())
        {
            System.out.println(it.next());
        }
    }
}
