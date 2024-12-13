package org.example;

import java.util.Scanner;

public class verificar {
    public static int verificacao(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o numero:");
        int num = scanner.nextInt();

        if(num > 0){
            System.out.println("O número é maior que zero");
        }else if(num < 0){
            System.out.println("O número é menor que zero");
        }else {
            System.out.println("O numero é igual a zero");
        }
        return num;
    }
}
