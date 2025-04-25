

import java.util.ArrayList;
import java.util.List;

// Remove Duplicates from Sorted Array

class practise {



    public static void main(String[] args) {

       practise p = new practise();

       int size =p.removeduplicates(new int[]{5,5,5,5,5});

        System.out.println("Final size after removing duplicates: "+size);

    }

   public int removeduplicates(int arr[]){


List <Integer> finalList=new ArrayList<>();

for(int i =0; i< arr.length; i++){
    if (!finalList.contains(arr[i])) {
    finalList.add(arr[i]);
    }
    }
return finalList.size();

        }

    }


