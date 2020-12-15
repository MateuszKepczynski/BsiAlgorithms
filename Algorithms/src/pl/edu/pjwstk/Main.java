/*
Author:
Mateusz Kępczyński
Kacper Szyca
*/

package pl.edu.pjwstk;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        AlgoritsmRepository algoritsmRepository = new AlgoritsmRepository();
        Scanner scan = new Scanner(System.in);
        int choice = 0;
        System.out.printf("Z którego algorytmu chciałbyś skorzystać? \n 1. Blowfish \n2.  \n3.  \n");
      //  do{
            choice = algoritsmRepository.inputValueInt();
     //   }while(choice > 0 && choice < 4);

        switch (choice){
            case 1:
                Blowfish blowfish = new Blowfish();
                blowfish.run();
            case 2:
                break;
            case 3:
                break;
        }
    }
}
