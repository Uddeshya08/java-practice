package codingPractice;


/*Given an Array of size N and a values K,
around which we need to right rotate the array. How to quickly print the right rotated array?
Input: Array[] = {1, 3, 5, 7, 9}, K = 2.
Output: 7 9 1 3 5

 **/
public class rotatenum {

    public static void main(String[] args) {

        int[] rotate={1,3,5,7,9};
        int size=rotate.length;
        int k=3;
        int [] roarr=new int[5];


            for (int i = k; i <= size - 1; i++) {
                int temp = rotate[i];
                roarr[i] = temp;
                System.out.print(roarr[i]+", ");

            }
            for (int j = 0; j <= k - 1; j++) {
                int temp = rotate[j];
                rotate[j] = temp;
               System.out.print(rotate[j]+", ");
            }

        }

    }
