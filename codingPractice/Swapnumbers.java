package codingPractice;

public class Swapnumbers {

    public static void main(String[] args) {

        int a=-3;
        int b=-7;

        System.out.println("Before SWAP A= "+a + ", B= "+b);

        a=a+b; //-3+7 = 4
        b=a-b; //4+(-7) = -3
        a=a-b; //4-(-3) = -7

        System.out.println("After swap A ="+ a);

        System.out.println("After swap B ="+ b);

    }
}
