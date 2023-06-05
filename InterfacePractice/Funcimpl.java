package InterfacePractice;

public class Funcimpl
{

    public static void main(String[] args) {

        //implementing functional interface with help of lambda expression
        FuncInterface fc=(a,b)->a+b;

        System.out.println("sum is "+fc.sum(1,2));

        Stringlen length=(str) -> str.length();

        System.out.println("Length of string is: "+length.getLength("Uddeshya"));

    }



}
