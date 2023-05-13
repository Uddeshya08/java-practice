package practiceString;

public class stringType {

    public static void main(String[] args) {
        vote vt = new vote();
        System.out.println(vt.vote(3));



/*
        //String literal
        String s1 = "apple";
        String s2 = "mango";
        String s3 = "apple";

        if(s1==s2) //apple == mango ?
            System.out.println("true");
        else
            System.out.println("false");

        if(s1==s3) //apple == apple ?
        {
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }

        //String Object

        String s4 = new String();
           s4="Apple";
        String s5 = new String();
           s5="Mango";
        String s6 = new String();
           s6="Apple";

           String s7=new String("Guava");
           String s8 = new String("Guava");

           if (s7==s8){
               System.out.println("Guava true");
           }
           else {
               System.out.println("Guava false");
           }

        if(s4==s5) //apple == mango ?
            System.out.println("true");
        else
            System.out.println("comparing object false");

        if(s4==s6) //apple == apple ?
        {
            System.out.println(s4+"="+s6);
            System.out.println("true");
        }

        if (s4.equals(s6)) {
            System.out.println(s4+"="+s6);

        } else{
            System.out.println("false");
        }

        if(s3==s6) //apple == apple ?
        {
            System.out.println(s3+"="+s6);
            System.out.println("true");
        }
        else {
            System.out.println("false object compared");
        }
*/
    }


}


class vote{

    public int vote(int age){

        System.out.println("age");
        return age;
    }

}

