package devoirs.devoir03;

import java.util.Scanner;

public class Devoirs03 {

    public static void main(String[] args) {
        // Déclaration des variables
        int jour, mois, annee;

        try (// Scanner pour saisir la date
                Scanner sc = new Scanner(System.in)) {
            // Demander l'entrée de l'utilisateur pour la date
            System.out.print("Entrez le jour : ");
            jour = sc.nextInt();

            System.out.print("Entrez le mois : ");
            mois = sc.nextInt();

            System.out.print("Entrez l'année : ");
            annee = sc.nextInt();
        }

        // Variable pour stocker le numéro du jour de l'année
        int numJour = 0;

        // Tableau contenant le nombre de jours dans chaque mois (année non bissextile)
        int[] joursParMois = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

        // Vérifier si l'année est bissextile
        boolean bissextile = false;

        if (annee % 4 == 0) {
            if (annee % 100 == 0) {
                if (annee % 400 == 0) {
                    bissextile = true;
                }
            } else {
                bissextile = true;
            }
        }

        // Ajustement pour février si l'année est bissextile
        if (bissextile) {
            joursParMois[1] = 29; // Février a 29 jours dans une année bissextile
        }

        // Calculer le numéro du jour dans l'année
        switch (mois) {
            case 1:
                numJour = jour;
                break;
            case 2:
                numJour = joursParMois[0] + jour;
                break;
            case 3:
                numJour = joursParMois[0] + joursParMois[1] + jour;
                break;
            case 4:
                numJour = joursParMois[0] + joursParMois[1] + joursParMois[2] + jour;
                break;
            case 5:
                numJour = joursParMois[0] + joursParMois[1] + joursParMois[2] + joursParMois[3] + jour;
                break;
            case 6:
                numJour = joursParMois[0] + joursParMois[1] + joursParMois[2] + joursParMois[3] + joursParMois[4]
                        + jour;
                break;
            case 7:
                numJour = joursParMois[0] + joursParMois[1] + joursParMois[2] + joursParMois[3] + joursParMois[4]
                        + joursParMois[5] + jour;
                break;
            case 8:
                numJour = joursParMois[0] + joursParMois[1] + joursParMois[2] + joursParMois[3] + joursParMois[4]
                        + joursParMois[5] + joursParMois[6] + jour;
                break;
            case 9:
                numJour = joursParMois[0] + joursParMois[1] + joursParMois[2] + joursParMois[3] + joursParMois[4]
                        + joursParMois[5] + joursParMois[6] + joursParMois[7] + jour;
                break;
            case 10:
                numJour = joursParMois[0] + joursParMois[1] + joursParMois[2] + joursParMois[3] + joursParMois[4]
                        + joursParMois[5] + joursParMois[6] + joursParMois[7] + joursParMois[8] + jour;
                break;
            case 11:
                numJour = joursParMois[0] + joursParMois[1] + joursParMois[2] + joursParMois[3] + joursParMois[4]
                        + joursParMois[5] + joursParMois[6] + joursParMois[7] + joursParMois[8] + joursParMois[9]
                        + jour;
                break;
            case 12:
                numJour = joursParMois[0] + joursParMois[1] + joursParMois[2] + joursParMois[3] + joursParMois[4]
                        + joursParMois[5] + joursParMois[6] + joursParMois[7] + joursParMois[8] + joursParMois[9]
                        + joursParMois[10] + jour;
                break;
            default:
                System.out.println("Mois invalide.");
                return;
        }

        // Afficher le résultat
        System.out.println("Nous sommes le jour N°" + numJour + " de l'année.");
    }
}
