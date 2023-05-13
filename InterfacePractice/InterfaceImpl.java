package InterfacePractice;

public class InterfaceImpl implements interFace {
    @Override
    public void checkmethod() {
        int i=9;
        int p=07; // prefixed with 0 is consider as octal & if >7 value gives err eg.09
        System.out.println("Interface method running");
    }
    public static void main(String[] args) {
        InterfaceImpl intobj=new InterfaceImpl();
        intobj.checkmethod();


        System.out.println(intobj.i);

    }



}
