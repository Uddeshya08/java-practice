package codingPractice;

import java.sql.SQLOutput;

public class fabonacci {

    //fabonacci - 0,1,1,2,3,5,8,13,19...

    public static void main(String[] args) {

        int n=10;
        int firsterm=0; // 1 2
        int fab; //1  2
        int secondterm=1; // 1 2
        for (int i=1; i<=n; i++){

            System.out.print(firsterm+ " ,");

            fab=firsterm+secondterm;
            firsterm=secondterm;
            secondterm=fab;


        }


    }
}
