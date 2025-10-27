import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class practise{

    public static void main(String[] args) {

     
        List<Integer> pract=Arrays.asList(51,4,32,9,33);

        //sorting
        pract.stream().sorted().forEach(System.out::println);

        //reverse sorting/ descending order
        pract.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);

    }



}


