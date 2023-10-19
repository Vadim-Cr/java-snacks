package org.esercizi.java;

import java.util.Scanner;

public class Snack1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int yourNumber = 1;

        while(yourNumber>0){
            System.out.println("write a number");
            yourNumber = scanner.nextInt();
            if (yourNumber<0) {
                System.out.println("mi dispiace ma il gioco è finito, ciao");
                break;
            } else if (yourNumber%2!=0) {
                System.out.println("Solo numeri pari, forse volevi scrivere: " + (yourNumber+1) + " ?");

            } else {
                System.out.println("Congratulazioni, il numero " + yourNumber + " è pari, continua!");
            }
        }
        scanner.close();
    }
}
