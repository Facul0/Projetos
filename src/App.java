

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
     
        Scanner obj = new Scanner(System.in);
        System.out.println(obj);
        System.out.println("true/false");
        boolean b = obj.nextBoolean();
        if (b == true) {
           System.out.println("é verdade");

        }else if (b == false) {
            System.out.println("mentira");
        }
        
    }

    
    }

    