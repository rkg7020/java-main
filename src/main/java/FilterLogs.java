import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class FilterLogs {
    public static void main(String[] args)  {

        try {
            File file1=new File ("D:\\projects\\java-main\\java-main\\src\\main\\resources\\mFile.txt");

            InputStream inputStream=  FilterLogs.class.getClassLoader().getResourceAsStream("mFile.txt");

            if (inputStream == null) throw new AssertionError();
           // BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(inputStream));
             BufferedReader bufferedReader=new BufferedReader(new FileReader(file1));
          int i= (int) Files.lines(Path.of(file1.getPath())).filter(s ->!s.isBlank() ).filter(s -> s.toLowerCase().contains("alert".toLowerCase())).count();
            System.out.println("i="+i);
          Scanner scanner=new Scanner(file1);
            while (scanner.hasNextLine()){
                System.out.println(" scannner="+scanner.nextLine());
                                                                                }
            String st;
            int count = 0;
            while((st = bufferedReader.readLine()) !=null){

                System.out.println(st);
                if (st.toLowerCase().contains("alert".toLowerCase())) {

                    count++;
                    continue;
                }

            }
            System.out.println("count ="+count);
            bufferedReader.close();
            inputStream.close();
            inputStream.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {


        }


    }
}
