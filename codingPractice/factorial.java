package codingPractice;

public class factorial {

    public static void main(String[] args) {

        //4!=4*3*2*1

        int fac=6;
        int result=1;

        for(int i=1; i<=fac; i++)

        {
            result=result*i;

        }
        System.out.println("factorial of "+fac+ " is "+result);
    }

}
