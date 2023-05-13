package codingPractice;

import java.sql.SQLOutput;

public class fabonacci {

    //fabonacci - 0,1,1,2,3,5,8,13,19...

    public static void main(String[] args) {

        int n=10;
        int sum=1;
        int fab=0;
        for (int i=1; i<=n; i++){

            fab=sum+fab;

            System.out.println("series: "+ fab);

        }

    }
}
