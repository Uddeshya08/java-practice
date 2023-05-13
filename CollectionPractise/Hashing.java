package CollectionPractise;

import java.sql.SQLOutput;
import java.util.HashMap;

public class Hashing {

    public static void main(String[] args) {
        HashMap<String, Integer>  maph=new HashMap<>();

        maph.put("Ashok",1);
        maph.put("Uddeshya",2);
        maph.put("Saransh",3);

        System.out.println(maph);

        maph.put("Saransh",4); //override value

        System.out.println(maph);

        System.out.println(maph.containsKey("Ashok")); //search

        System.out.println(maph.get("Uddeshya"));


    }
}
