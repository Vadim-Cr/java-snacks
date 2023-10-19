package org.esercizi.java;

import java.util.Random;

public class Snack2 {
    public static void main(String[] args) {
        /*todo
        *  Generatore di “nomi cognomi” casuali: il Grande Gatsby ha una lista di nomi e una lista di cognomi, e da queste vuole mostrare a video una falsa lista di invitati con nome e cognome.
        * */
        String[] nomi = {
                "Mario", "Luca", "Francesco", "Roberto", "Giuseppe",
                "John", "Michael", "William", "David", "Richard",
                "Hans", "Jürgen", "Klaus", "Günther", "Wolfgang",
                "Pierre", "Jean", "Jacques", "Henri", "François"
        };

        String[] cognomi = {
                "Rossi", "Bianchi", "Verdi", "Neri", "Gialli",
                "Smith", "Johnson", "Williams", "Brown", "Jones",
                "Müller", "Schmidt", "Schneider", "Fischer", "Weber",
                "Martin", "Bernard", "Dubois", "Thomas", "Robert"
        };


            Random random = new Random();
        for (int i = 0; i < nomi.length; i++) {

            int indexN = random.nextInt(nomi.length);
            int indexC = random.nextInt(cognomi.length);

            System.out.println(nomi[indexN] + " " + cognomi[indexC]);
        }


    }
}
