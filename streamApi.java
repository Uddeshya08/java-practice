import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class streamApi {

    public static void main(String[] args) {


        ArrayList<Integer> list = new ArrayList<>();
        list.add(28);
        list.add(39);
        list.add(50);
        list.add(76);


        //filter example
        Stream<Integer> streamList=list.stream();

        List<Integer> newList= streamList.filter(e->e%2==0)//Filter Returns a stream consisting of the elements of this stream that match the given predicate
                .collect(Collectors.toList());

        System.out.println(newList);

        //map example
        Stream<Integer> streammap=list.stream();
        List<Integer> newMap= streammap.map(i->i*i). //performs operation on each element
                collect(Collectors.toList());
        System.out.println(newMap);

        //print occurence of words with string
        List<String> name=List.of("Abhay","Uddeshya","Uddeshya", "Abhay", "Saransh");
        List<String> newNAme= name.stream().filter(e-> e.startsWith("A")).collect(Collectors.toList());
        System.out.println(newNAme);
        //using collect function to store count of words and its occurences in Map
        Map<String, Long> occur=name.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(occur);


    }
}

