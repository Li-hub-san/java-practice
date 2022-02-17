import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Application {

  public static void main(String[] args) {
//    Homework homework = new Homework();
//    homework.createAndPrintEmployees();

    List<String> myList = Arrays.asList("a1","a2", "b1", "c2", "c1");

    Stream<String> stream = myList.stream();

    List<Integer> newList = stream
            .map(s -> s.toUpperCase())
            .filter(s -> s.toUpperCase().startsWith("C"))
            .map(s -> s.replace("C",""))
            .map(s -> Integer.parseInt(s))
            .toList();
    System.out.println(newList);


  }

}
