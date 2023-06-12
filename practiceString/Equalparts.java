package practiceString;

public class Equalparts {

    public static void main(String[] args) {

        String str="aaabbbccc";

        int len=str.length();

        int n=3;
        int temp=0;
        String[] strar=new String[n];
        for(int i=0; i<=len; i++){
            int j=i+n;
           String tempstr=str.substring(i,j);
           strar[temp]=tempstr;
            temp++;
        }
for(int j=0; j< strar.length-1; j++){
    System.out.println(strar[j]);
}


    }
}
