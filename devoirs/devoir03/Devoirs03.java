package devoirs.devoir03;

import java.util.Scanner;

public class Devoirs03 {

    public static void main(String[] args) {
       
        int jour, mois, annee;

        try (
                Scanner sc = new Scanner(System.in)) {
          
            System.out.print("Entrez le jour : ");
            jour = sc.nextInt();

            System.out.print("Entrez le mois : ");
            mois = sc.nextInt();

            System.out.print("Entrez l'année : ");
            annee = sc.nextInt();
        }

       
        int numJour = 0;

       
        int[] joursParMois = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

       
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

      
        if (bissextile) {
            joursParMois[1] = 29; 
        }

     
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

        
        System.out.println("Nous sommes le jour N°" + numJour + " de l'année.");
    }
}
