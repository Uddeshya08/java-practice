package codingPractice;

import java.util.ArrayList;

public class duplicateArray {

    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        list1.add(1);
        list1.add(2);
        list1.add(3);

        list2.add(9);
        list2.add(7);
        list2.add(1);

        System.out.println(list1);
        System.out.println(list2);

        int duplicateValue = 0;
        int index=0;
      for(int i=0; i< list1.size(); i++) {
          for (int j=0; j< list2.size(); j++){
              if(list1.get(i) ==list2.get(j)){
                  duplicateValue=list1.get(i);
                  index=list2.indexOf(duplicateValue);
              }
          }
      }
      if (duplicateValue==0) {

            System.out.println("No duplicate element");
        }
        System.out.println("Duplicate value in both the array is: "+duplicateValue+" at position " +index);
    }

}
