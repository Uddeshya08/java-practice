package codingPractice;

import java.util.Scanner;

public class checknegative {

    public static void checkneg(int n){
        if(n>0) {
            System.out.println(n);
        }
        else if(n<0)
        {
            System.out.println(n*-1);
        }


    }



    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        checkneg(n);

    }

}
