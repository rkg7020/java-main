import java.util.*;

public class ArrDemo1 {
    public static void main(String[] args) {

        List<Integer> myList = Arrays.asList(10,15,15,8,49,25,98,19,32,2,788,9);
        myList.stream()
                .map(s -> s + "") // Convert integer to String
                .filter(s -> s.startsWith("1"))
                .forEach(System.out::println);
        System.out.println("second filter");
        myList.stream().filter(integer -> Math.round(integer/ 10)==1  ).forEach(System.out::println);
        Set<Integer> set = new HashSet<>();
        System.out.println("3 duplicate no filter");

        myList.stream().filter( integer -> !set.add(integer)  ).forEach(System.out::println);
        int max =  myList.stream()
                .max(Integer::compare)
                .get();
    }
}
