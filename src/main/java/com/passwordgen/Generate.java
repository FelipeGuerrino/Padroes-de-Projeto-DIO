package com.passwordgen;

import java.util.Random;
import java.util.Scanner;

public class Generate {

    private Generate(){}; //Singleton
    public static PasswordRepository repo = new PasswordRepository();

    private static String generatePassword(){
        //Veja a tabela em https://www.smashingmagazine.com/2012/06/all-about-unicode-utf8-character-sets/
        int leftLimit = 33; // char '!'
        int rightLimit = 122; // char 'z'
        int targetStringLength = 16;

        Random random = new Random();
        StringBuilder buffer = new StringBuilder(targetStringLength);

        for (int i = 0; i < targetStringLength; i++) {
            int randomLimitedInt = leftLimit + (int) 
            (random.nextFloat() * (rightLimit - leftLimit + 1));
            buffer.append((char) randomLimitedInt);
        }

        String generatedString = buffer.toString();

        System.out.println(generatedString);
        return generatedString;

    }

    public static void create(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite uma chave para sua senha");

        String newKey = scan.next();
        repo.addPassword(newKey, generatePassword());
    }
}
