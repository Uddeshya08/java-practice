import java.sql.SQLOutput;

public class Inheritance_Practise {

    public static void main(String[] args) {

        Person p = new Person();

        int pa = p.age = 18;
        String pn = p.name = "Uddesh";
        int pa1 = p.age = 19;
        String pn1 = p.name = "Ashok";

        //    System.out.println("Age of "+ pn+" is "+pa);
        //   System.out.println("Age of "+ pn1+" is "+pa1);

//        p.run();
//        p.sleep();
//        p.sleep(9);

        Dev d1 = new Dev(2, "java");
        d1.work(2,"Java");



    }
}

    class Dev extends Manager{

        public Dev (int hours, String lang){
            super();

        }
    }


class Manager {

    String name;
    int age;

int hours;
String lang;

    static int count;

    public void work(int hours, String lang){
        this.hours=hours;
        this.lang=lang;
        System.out.println("Works for "+hours+" hours in "+lang);

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
