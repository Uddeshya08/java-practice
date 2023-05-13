import java.sql.SQLOutput;

class Polymorphism {

    public static void main(String[] args) {

        Person p=new Person();

            int pa= p.age=18;
            String pn=  p.name="Uddesh";
            int pa1= p.age=19;
            String pn1=  p.name="Ashok";

        //    System.out.println("Age of "+ pn+" is "+pa);
         //   System.out.println("Age of "+ pn1+" is "+pa1);

                p.run();
                p.sleep();
                p.sleep(9);


    }

}
class Person {

    String name;
    int age;

    static int count;

    public Person(){
        count++;
        System.out.println("Default constructor called "+ count);

    }

    void run(){
        System.out.println(name+ "Runs in morning");
    }

    void sleep(){
        System.out.println(name + "Sleeps in night");}

    void sleep(int s){
        System.out.println(name + "sleeps for "+s+" hours");
    }

}