package codingPractice;

public class matrix {

    public static void main(String[] args) {

        int n=5;

        for(int i=0; i<n; i++){

            for(int j=0; j<n; j++){
                if (i == j || i == n - 1 - j) { //check if i and j are at diagonal position then print 1
                    System.out.print("1");
                } else {                  //else print zero
                    System.out.print("0");
                }

            }

            System.out.println();
        }
        /*
        1001
        0110
        0110
        1001
         */

    }

}
