package Java.Easy;
import java.util.*;

public class If_Else {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            int N = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            if(N>0 && N<101 && N%2 == 0){

                if(N>=2 && N<=5){

                    System.out.println("Not Weird");
                }else if(N>=6 && N<=20){

                    System.out.println("Weird");
                }else if(N>=20){

                    System.out.println("Not Weird");
                }
            }
            else System.out.println("Weird");   

        } catch (Exception e) {
    
            System.out.println("Weird");
        }
    }
}
