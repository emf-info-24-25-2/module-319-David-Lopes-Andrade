package devoirs.devoir05;

import java.util.Scanner;
import java.util.Random;

public class Devoirs05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Générer aléatoirement un nombre entre 1 et 100
        Random random = new Random();
        int nombreMystere = random.nextInt(100) + 1;

        int valeur;

        System.out.println("Entrez un valeur svp : ");

        do {
            valeur = sc.nextInt();

            if (valeur < nombreMystere) {

                System.out.println("Trop petit !");
            } else if (valeur > nombreMystere) {

                System.out.println("Trop grand !");
            } else {

            }
        } while (valeur != nombreMystere);

        sc.close();
    }
}
