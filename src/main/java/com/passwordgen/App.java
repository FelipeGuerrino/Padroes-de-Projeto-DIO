package com.passwordgen;

import java.util.Scanner;


/**
 * App
 */
public class App {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String response;
        System.out.println("---\tRandom password generator\t---");
            
        do{
            Generate.create();
            System.out.println("Deseja criar uma nova senha? (s/n)");
            response = scan.next();
        }while(response.equalsIgnoreCase("s"));

        scan.close();
        System.out.println("Senhas criadas:");
        Generate.repo.printPasswords();
        
        
    }
}