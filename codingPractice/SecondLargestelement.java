

import java.util.ArrayList;
import java.util.List;



class practise {
    public static void main(String[] args) {
       practise p = new practise();
       int element =p.secondLargest(new int[]{1,2,3,5});
      System.out.println("Second largest number in array: "+element);
    }
public int secondLargest(int arr[]){

int largestnum=Integer.MIN_VALUE;
int secndnum=Integer.MIN_VALUE;

for(int i =0; i< arr.length; i++){
    if (arr[i]>largestnum) {
        secndnum=largestnum;
    largestnum=arr[i];

    }
    }
return secndnum;
        }

    }
