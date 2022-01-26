package Java.Easy;

import java.util.Scanner;

public class DataTypes {
    
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String []argh){

        byte i = 0;

        for (int j = 0; j < 6; j++) {

            try {
             
                int x = scanner.nextInt();
                
                if(x>=9 && x<=-9) System.out.println(x+" can be fitted in:");
    
                if(x>=-333333333 && x<=333333333) i = 3;
                if(x>=-150000 && x<=150000) i = 2;
                if(x>=-150 && x<=150) i = 1;
                if(x>=-9 && x<=9) continue;
                
                switch (i) {
   
                    case 1:
                        
                        System.out.println("* short");
                        System.out.println("* int");
                        System.out.println("* long");
                        break;
    
                    case 2:
                        
                        System.out.println("* int");
                        System.out.println("* long");
                        break;
                        
                    case 3:
                        
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