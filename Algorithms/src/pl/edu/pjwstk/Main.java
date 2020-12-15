/*
Author:
Mateusz Kępczyński
Kacper Szyca
*/

package pl.edu.pjwstk;

import java.util.Scanner;

import static pl.edu.pjwstk.Twofish.encrypt;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        AlgoritsmRepository algoritsmRepository = new AlgoritsmRepository();
        int choice = 0;
        System.out.printf("Z którego algorytmu chciałbyś skorzystać? \n 1. Twofish \n2.  \n3.  \n");
      //  do{
            choice = algoritsmRepository.inputValueInt();
     //   }while(choice > 0 && choice < 4);

        switch (choice){
            case 1:
                Twofish twofish = new Twofish();
                try{
                    twofish.encrypt("asd", "haslo");
                }catch (Exception e){

                }

                System.out.printf("wybrano 1");
                break;
            case 2:
                break;
            case 3:
                break;
        }
    }
}
