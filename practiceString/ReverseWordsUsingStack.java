package Interview;

import java.awt.*;
import java.util.*;
import java.util.List;

//Input: I am Uddeshya
//Output: Uddeshya am I

/* 
step-1 split string,
step-2 push words into stack,
step-3 pop words from stack + append " " spaces, and append to some string temp value and print that
  */

class intrv {


    public static void main(String[] args) {

String s="I am Uddeshya"; 
      

Stack<String> reverse=new Stack<>();

String[] rev=s.split(" ");

for(String words: rev){
    reverse.push(words);
}

        StringBuilder reversed = new StringBuilder();
while(!reverse.isEmpty()){
    reversed.append(reverse.pop()).append(" ");
}
      System.out.println("reverse string words: "+ reversed);

    }
}
