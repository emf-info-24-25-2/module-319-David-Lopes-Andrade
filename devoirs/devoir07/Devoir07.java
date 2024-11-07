package devoirs.devoir07;
import java.util.Random;

public class Devoir07 {

        // Déclaration des constantes
    public static final int TAILLE_TABLEAU = 10;
    public static final int MIN_NOMBRE = -8;
    public static final int MAX_NOMBRE = 8;
    public static final int VALEUR_RECHERCHEE = 7;

    public static void main(String[] args) {
        // Génération d'un tableau de nombres aléatoires
        int[] tableau = genererValeursAleatoires(TAILLE_TABLEAU, MIN_NOMBRE, MAX_NOMBRE);

        // Recherche de la valeur dans le tableau
        int position = positionValeur(tableau, VALEUR_RECHERCHEE);

        // Affichage des informations

        System.out.println("Le tableau d'entiers généré contient : " + TAILLE_TABLEAU + " valeurs");
        System.out.print("Les deux premières/dernières valeurs sont : ");
        System.out.print("[" + tableau[0] + "] ");
        System.out.print("[" + tableau[1] + "] ... ");
        System.out.println("[" + tableau[TAILLE_TABLEAU - 2] + "] [" + tableau[TAILLE_TABLEAU - 1] + "]");

        if (position != -1) {
            System.out.println("La valeur " + VALEUR_RECHERCHEE + " figure à la position N°" + position + " du tableau !");
        } else {
            System.out.println("La valeur " + VALEUR_RECHERCHEE + " n'a pas été trouvée dans le tableau.");
        }

        // Affichage du contenu complet du tableau
        System.out.println("Voici le contenu du tableau :");
        for (int i = 0; i < TAILLE_TABLEAU; i++) {
            System.out.println("Tableau[" + i + "] = " + tableau[i]);
        }
    }

    // Méthode pour générer un tableau de valeurs aléatoires
    public static int[] genererValeursAleatoires(int taille, int min, int max) {
        Random rand = new Random();  // Utilisation de la classe java.util.Random
        int[] tableau = new int[taille];

        for (int i = 0; i < taille; i++) {
            // Génération d'un nombre aléatoire dans la plage [min, max]
            tableau[i] = rand.nextInt((max - min) + 1) + min;
        }

        return tableau;
    }

    // Méthode pour trouver la position d'une valeur dans un tableau
    public static int positionValeur(int[] tableau, int valeur) {
        for (int i = 0; i < tableau.length; i++) {
            if (tableau[i] == valeur) {
                return i; // Retourne la position de la première occurrence
            }
        }
        return -1; // Si la valeur n'est pas trouvée
    }
}