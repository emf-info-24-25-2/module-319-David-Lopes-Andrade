package devoirs.devoir06;



import java.util.Random;

public class devoirs06 {

    // Déclaration des constantes
    public static final int TAILLE_TABLEAU = 20;
    public static final int VALEUR_MIN = 0;
    public static final int VALEUR_MAX = 50;
    public static final int VALEUR_RECHERCHEE = 7;

    public static void main(String[] args) {
        // Création du tableau avec des valeurs aléatoires
        int[] tableau = genereTableau(TAILLE_TABLEAU, VALEUR_MIN, VALEUR_MAX);

        // Affichage du tableau
        System.out.println("Contenu du tableau : ");
        for (int i = 0; i < tableau.length; i++) {
            System.out.print(tableau[i] + " ");
        }
        System.out.println();

        // Recherche du minimum et du maximum
        int min = rechercheMin(tableau);
        int max = rechercheMax(tableau);

        System.out.println("Valeur minimale : " + min);
        System.out.println("Valeur maximale : " + max);

        // Recherche de la valeur recherchée
        int indexRecherchee = rechercheValeur(tableau, VALEUR_RECHERCHEE);
        if (indexRecherchee != -1) {
            System.out.println("La valeur " + VALEUR_RECHERCHEE + " se trouve à l'index " + indexRecherchee);
        } else {
            System.out.println("La valeur " + VALEUR_RECHERCHEE + " n'a pas été trouvée dans le tableau.");
        }
    }

    // Méthode qui génère un tableau d'entiers aléatoires
    public static int[] genereTableau(int taille, int valeurMin, int valeurMax) {
        int[] tableau = new int[taille];
        Random random = new Random();
        
        for (int i = 0; i < tableau.length; i++) {
            tableau[i] = random.nextInt(valeurMax - valeurMin + 1) + valeurMin;
        }
        
        return tableau;
    }

    // Méthode qui recherche la valeur minimale dans le tableau
    public static int rechercheMin(int[] tableau) {
        int min = tableau[0];
        for (int i = 1; i < tableau.length; i++) {
            if (tableau[i] < min) {
                min = tableau[i];
            }
        }
        return min;
    }

    // Méthode qui recherche la valeur maximale dans le tableau
    public static int rechercheMax(int[] tableau) {
        int max = tableau[0];
        for (int i = 1; i < tableau.length; i++) {
            if (tableau[i] > max) {
                max = tableau[i];
            }
        }
        return max;
    }

    // Méthode qui recherche une valeur dans le tableau
    public static int rechercheValeur(int[] tableau, int valeurRecherchee) {
        for (int i = 0; i < tableau.length; i++) {
            if (tableau[i] == valeurRecherchee) {
                return i; // Retourne l'index où la valeur est trouvée
            }
        }
        return -1; // Si la valeur n'est pas trouvée, retourne -1
    }
}
