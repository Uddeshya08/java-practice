public class Abstraction {

    public static void main(String[] args) {

            BMW b=new BMW();
            b.appearance();
            Tesla t=new Tesla();
            t.appearance();
    }


}

class BMW extends car{

    @Override // indicates that the child class method is over-writing its base class method
    void appearance(){
        System.out.println("Bmw White");
    }

}


class Tesla extends car{

  @Override // indicates that the child class method is over-riding its base class method
 void appearance(){
     System.out.println("Tesla car");
}
}
abstract class car{   // is a restricted class that cannot be used to create objects
                     // (to access it, it must be inherited from another class which extends it).

    String color;
    int price;

   abstract void appearance();
   /*
   {
       System.out.println("car starting"); -- Abstract method cannot have a body
    }

    */
}