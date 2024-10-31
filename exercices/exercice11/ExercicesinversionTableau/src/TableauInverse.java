import java.util.Random;

public class TableauInverse {

    // Déclaration des constantes MIN et MAX
    public static final int MIN = 0;
    public static final int MAX = 100;

    public static void main(String[] args) {
        // Déclaration du tableauInitial
        int[] tableauInitial = new int[6];

        // Remplissage du tableauInitial avec des valeurs aléatoires
        Random random = new Random();
        for (int i = 0; i < tableauInitial.length; i++) {
            tableauInitial[i] = random.nextInt(MAX - MIN + 1) + MIN;
        }

        // Affichage du contenu du tableauInitial
        System.out.println("Contenu du tableau initial :");
        for (int i = 0; i < tableauInitial.length; i++) {
            System.out.println("Tableau initial [" + i + "] = " + tableauInitial[i]);
        }

        // Déclaration du tableauFinal
        int[] tableauFinal = inverseLeTableau(tableauInitial);

        // Affichage du contenu du tableauFinal
        System.out.println("Contenu du tableau final :");
        for (int i = 0; i < tableauFinal.length; i++) {
            System.out.println("Tableau final [" + i + "] = " + tableauFinal[i]);
        }
    }

    // Méthode pour inverser le tableau
    public static int[] inverseLeTableau(int[] tableau) {
        int[] tableauInverse = new int[tableau.length];
        for (int i = 0; i < tableau.length; i++) {
            tableauInverse[i] = tableau[tableau.length - 1 - i];
        }
        return tableauInverse;
    }
}
