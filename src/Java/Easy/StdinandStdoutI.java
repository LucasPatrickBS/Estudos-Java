package Java.Easy;
import java.util.*;

public class StdinandStdoutI {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        String myString = scanner.next();

        int myInt = scanner.nextInt();
        int mySecoundInt = scanner.nextInt();

        scanner.close();
    
        System.out.println(myString);
        System.out.println(myInt);
        System.out.println(mySecoundInt);
    }
}
