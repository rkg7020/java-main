import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.security.KeyStore;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Java8Demo {
   public static void main(String[] args) throws IOException {
//         File file  = new File("src/main/resources/mFile.txt");
//        System.out.println("read file");
//        System.out.println(file.canRead()) ;
//        BufferedReader br =new BufferedReader(new FileReader("src/main/resources/mFile.txt"));
//        String line;
//        br.lines().map()
//        while (br.lines().)
//        while ( (line = br.readLine() )!=null){
//            System.out.println(line);
//        }
//        Scanner reader = new Scanner(file);
//
//    }
//
//    Function toObj=(String s)  -> {
//
//        retun new Date();
//
//    };


    // When you have a List of null values and Lists of Integers and null
// values, how would you calculate the sum of all integers using java 8 ?

    List<Integer> l1 = Arrays.asList(1,null,2,null,3);
    List<Integer> l2 = Arrays.asList(3,null,4,null,5);
    List<List<Integer>> list = Arrays.asList(l1, null, l2);

        //System.out.println("sum = " + sumLists(list));
    Map<String, String> books = new HashMap<>();
        books.put(
                "C978-0201633610", "Design patterns");
        books.put(
                "A978-1617291999", "Java 8 ");
        books.put("B978-0134685991", "Effective Java");
       books.put("AD178-0134685991", "Effective Java");
       books.put("12D178-0134685991", "AEffective Java");

       TreeMap<String, String> collect = books.entrySet().stream()               //.sorted( Map.Entry.<String, String>comparingByValue().reversed())
               .collect(Collectors.toMap(Map.Entry::getValue, Map.Entry::getKey, (s, s2) -> s2, TreeMap::new));

       System.out.println(collect);
   }
}
