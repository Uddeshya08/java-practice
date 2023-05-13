package Encapsulation_parent;

public class Parent {


    public static void main(String[] args) {


        Laptop lp = new Laptop();
        lp.setPrice(23999.19989);
        System.out.println("Price:"+ lp.getPrice());
    }


}

class Laptop{

    int RAM;
  private  Double price;

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
       boolean isAdmin=false;
        if (isAdmin){
            System.out.println("No admin access");
        }
else{
            this.price = price;
        }

    }

    public int getRAM() {
        return RAM;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }
}





