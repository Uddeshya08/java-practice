package CollectionPractise;

import java.util.*;

public class arrayList {

    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<String>();
        al.add("NewZealand");
        al.add("India");
        al.add("England");

    //    Iterator it = al.iterator();
Collections.sort(al);

for(String country: al)
    System.out.println(al);



//        while (it.hasNext()){
//
//         //   al.set(1,"Australia");
//            System.out.println(it.next());
//        }


    }



}
