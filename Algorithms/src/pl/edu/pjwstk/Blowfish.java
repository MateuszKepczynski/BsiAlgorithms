/*
Author:
Kacper Szyca
*/
package pl.edu.pjwstk;


import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Base64;
import java.util.Scanner;

public class Blowfish {
    Scanner scan = new Scanner(System.in);
    private  String key;
    public void run(){
        AlgoritsmRepository algoritsmRepository = new AlgoritsmRepository();
        Blowfish blowfish = new Blowfish();
        boolean correctInput = false;
        int choice =0;
        System.out.printf("Wybierz co chcesz zrobić: \n1. Encrypt \n2. Decrypt \n");
        do{
            choice = algoritsmRepository.inputValueInt();

            if (choice == 1){
                correctInput = true;
                System.out.printf("Podaj klucz");
                key = scan.next();
                System.out.printf("Podaj hasło do Encryptu");
                System.out.printf("Zaszyfrwane haslo to "+encrypt(scan.next(), key));
            }else if (choice ==2 ){
                correctInput = true;
                System.out.printf("Podaj klucz");
                key = scan.next();
                System.out.printf("Podaj hasło do Decryptu");
                System.out.printf("Odszyforwane hasło to "+decrypt(scan.next(), key));
            }
        }while(correctInput == false);
    }

    public String encrypt (String password, String key){
        try{
            byte[] keyData = (key).getBytes();
            SecretKeySpec secretKeySpec = new SecretKeySpec(keyData,"Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(Cipher.ENCRYPT_MODE, secretKeySpec);
            byte[] hasil = cipher.doFinal(password.getBytes());
            return new String(Base64.getEncoder().encode(hasil));
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
    public String decrypt(String string, String key){
        try{
            byte[] keyData = (key).getBytes();
            SecretKeySpec secretKeySpec = new SecretKeySpec(keyData,"Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(Cipher.DECRYPT_MODE, secretKeySpec);
            byte[] hasil = cipher.doFinal(java.util.Base64.getDecoder().decode(string));
            return new String(hasil);
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
