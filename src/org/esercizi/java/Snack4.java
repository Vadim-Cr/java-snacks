package org.esercizi.java;

import java.util.Scanner;

public class Snack4 {
    public static void main(String[] args) {
//          Scanner
        Scanner scanner = new Scanner(System.in);

//          Creating the string
        String yourWord;
        System.out.println("write a word");
        yourWord = scanner.nextLine();
        System.out.println(yourWord);

//          Creating array of string length
        char[] arr = new char[yourWord.length()];

//          Copy character by character into array
        for (int i = yourWord.length() - 1, j = 0; i >= 0; i--, j++) {
            arr[j] = yourWord.charAt(i);
        }

//          Printing the character array
        for (char x : arr) {
//            System.out.println(x);
        }

        String str = new String(arr);
//        System.out.println(str);

        if(yourWord.equals(str)){
            System.out.println("Yay, this word is a palindrome!");
        } else {
            System.out.println("No luck, try again");
        }

        scanner.close();
    }
}
