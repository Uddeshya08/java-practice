package practiceString;

public class reverseString {

    public static void main(String[] args) {

        StringBuilder str=new StringBuilder();
        str.append("Code is working");
        System.out.println(str);
        System.out.println(str.reverse());

        String rvrsStr="gnikrow si edoC";
        String newStrng="";

        for (int i=rvrsStr.length()-1; i>=0; i--){

            newStrng=newStrng+rvrsStr.charAt(i);

        }
        System.out.println(newStrng);
    }
}
