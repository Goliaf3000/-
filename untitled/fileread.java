import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class fileread {
    public static void main(String[] args) throws IOException {
        FileInputStream inputf = new FileInputStream("C:\\Users\\f0680615\\Downloads\\223.txt");
        InputStreamReader read = new InputStreamReader(inputf);
        BufferedReader buf = new BufferedReader(read);
        Scanner scan = new Scanner(buf);
        List<Integer> list = new ArrayList<>();
        while (scan.hasNextInt()){
            int a = scan.nextInt();
            if ((a%2)==0){
                list.add(a);
            }
        }
        list.stream().sorted().forEach(System.out::println);
        scan.close();
        buf.close();
        inputf.close();
        read.close();
    }
}
