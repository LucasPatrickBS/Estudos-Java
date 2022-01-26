package Java.Easy;
import java.util.*;

public class StdinandStdoutII {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        
        try {
            int i = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            Double d = scanner.nextDouble();   
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            String s = scanner.nextLine();

            System.out.println("String: " + s);
            System.out.println("Double: " + d);
            System.out.println("Int: " + i);
            
        } catch (Exception e) {

            System.out.println("Weird");
        }
    }
}
