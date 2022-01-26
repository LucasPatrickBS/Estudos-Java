package Java.Easy;

import java.util.Scanner;

public class DataTypes {
    
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String []argh){

        byte i = 0;

        int lines =scanner.nextInt();

        for (int j = 0; j < lines; j++) {

            try {
             
                long x = scanner.nextLong();

                if(x>=-9223372036854775808L && x<=9223372036854775807L) i = 4;
                if(x>=-2147483648 && x<=2147483647) i = 3;
                if(x>=-32768 && x<=32767) i = 2;
                if(x>=-128 && x<=127) i = 1;

                switch (i) {
                   
                    case 1:
                        
                        continue;

                    case 2:
                        
                        System.out.println(x+" can be fitted in:");
                        System.out.println("* short");
                        System.out.println("* int");
                        System.out.println("* long");
                        break;
    
                    case 3:

                        System.out.println(x+" can be fitted in:");
                        System.out.println("* int");
                        System.out.println("* long");
                        break;
                        
                    case 4:
                        
                        System.out.println(x+" can be fitted in:");
                        System.out.println("* long");
                        break;

                    default:
    
                        System.out.println("Joined in default!");
                        break;
                }
                
            }
            catch(Exception e) {
    
                System.out.println(scanner.next()+" can't be fitted anywhere.");
            }       
        }
        
        scanner.close();
    }

}