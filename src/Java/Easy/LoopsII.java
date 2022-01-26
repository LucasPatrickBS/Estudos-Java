package Java.Easy;

import java.util.Scanner;

public class LoopsII {
    
    private static final Scanner scanner = new Scanner(System.in);
    
    private static int pot(int x, int y){

        return (int) Math.round(Math.pow(x, y));
    }

    public static void main(String []argh){

        int t = scanner.nextInt();
        int resultado = 0;
        int a = 0;
        int b = 0;
        int n = 0;

        for(int i=0;i<t;i++){

            a = scanner.nextInt();
            b = scanner.nextInt();
            n = scanner.nextInt();

            resultado = (a + pot(2, 0) * b);

            for(int var=1; var<=n; var++){

                System.out.print(resultado);
                System.out.print(" ");

                resultado = resultado + (pot(2, var)*b);
            }
            System.out.println();

        }
        scanner.close();
    }
}