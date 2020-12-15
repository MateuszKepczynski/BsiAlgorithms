package pl.edu.pjwstk;

import java.util.Scanner;

public class AlgoritsmRepository {
    Scanner scan = new Scanner(System.in);
    private boolean correctValue;
    public int inputValueInt(){
        int value = 0;
        correctValue = false;
        do{
            if(scan.hasNextInt()) {
                value = scan.nextInt();
                correctValue = true;
            }else{
                System.out.printf("Liczbę poproszę\n");
                scan.next();
            }
        }while (!correctValue);
        return value;
    }

}
