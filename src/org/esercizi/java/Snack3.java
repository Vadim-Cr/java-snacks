package org.esercizi.java;

import java.util.Random;

public class Snack3 {
    public static void main(String[] args) {
/*todo Crea un array di numeri interi e fai la somma di tutti gli elementi che sono in posizione dispari*/
//creating the range of numbers
int max = 1000;
int min = 1;

        Random rd = new Random(); // creating Random object
        int[] arr = new int[10];
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt((max -min)+1); // storing random integers in an array
            System.out.println(arr[i]); // printing each array element
            if (arr[i] % 2!=0) {
                sum += arr[i];
            }
        }
                System.out.println("total sum is: " + sum );


    }
}
