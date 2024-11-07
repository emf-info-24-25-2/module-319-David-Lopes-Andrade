package exercices.exercice10;

import java.util.Random;

public class TableauOperations {

    // 1. Créer un tableau d'entiers d'une certaine taille
    public static int[] creerTableau(int taille) {
        return new int[taille];
    }

    // 2. Remplir un tableau avec une valeur fixe
    public static int[] remplirAvecValeur(int[] tableau, int valeurFixe) {
        for (int i = 0; i < tableau.length; i++) {
            tableau[i] = valeurFixe;
        }
        return tableau;
    }

    // 3. Remplir un tableau avec des valeurs aléatoires
    public static int[] remplirAvecAleatoire(int[] tableau) {
        Random random = new Random();
        for (int i = 0; i < tableau.length; i++) {
            tableau[i] = random.nextInt(21); // Valeurs aléatoires entre 0 et 20
        }
        return tableau;
    }

    // 4. Déterminer la taille d'un tableau
    public static int tailleTableau(int[] tableau) {
        return tableau.length;
    }

    // 5. Afficher le contenu d'un tableau
    public static void afficherTableau(int[] tableau) {
        for (int i = 0; i < tableau.length; i++) {
            System.out.println("tab[" + i + "]=" + tableau[i]);
        }
    }

    // 6. Rechercher la valeur minimum d'un tableau
    public static int valeurMin(int[] tableau) {
        int min = tableau[0];
        for (int valeur : tableau) {
            if (valeur < min) {
                min = valeur;
            }
        }
        return min;
    }

    // 7. Rechercher la valeur maximum d'un tableau
    public static int valeurMax(int[] tableau) {
        int max = tableau[0];
        for (int valeur : tableau) {
            if (valeur > max) {
                max = valeur;
            }
        }
        return max;
    }

    // 8. Compter la fréquence d'une valeur dans un tableau
    public static int compterFrequence(int[] tableau, int valeur) {
        int count = 0;
        for (int v : tableau) {
            if (v == valeur) {
                count++;
            }
        }
        return count;
    }

    // 9. Établir la somme des valeurs contenues dans un tableau
    public static int sommeTableau(int[] tableau) {
        int somme = 0;
        for (int valeur : tableau) {
            somme += valeur;
        }
        return somme;
    }

    // 10. Établir la moyenne des valeurs contenues dans un tableau
    public static double moyenneTableau(int[] tableau) {
        return (double) sommeTableau(tableau) / tableau.length;
    }

    // 11. Remplacer une valeur par une autre dans un tableau
    public static int[] remplacerValeur(int[] tableau, int valeurRecherchee, int valeurRemplacement) {
        for (int i = 0; i < tableau.length; i++) {
            if (tableau[i] == valeurRecherchee) {
                tableau[i] = valeurRemplacement;
            }
        }
        return tableau;
    }

    // 12. Rechercher la première occurrence d'une valeur dans un tableau
    public static int premiereOccurrence(int[] tableau, int valeur) {
        for (int i = 0; i < tableau.length; i++) {
            if (tableau[i] == valeur) {
                return i;
            }
        }
        return -1; // valeur non trouvée
    }

    // 13. Rechercher la dernière occurrence d'une valeur dans un tableau
    public static int derniereOccurrence(int[] tableau, int valeur) {
        for (int i = tableau.length - 1; i >= 0; i--) {
            if (tableau[i] == valeur) {
                return i;
            }
        }
        return -1; // valeur non trouvée
    }

    // Méthode main pour tester
    public static void main(String[] args) {
        int taille = 5;
        int[] tableau = creerTableau(taille);
        tableau = remplirAvecAleatoire(tableau);

        System.out.println("Le tableau a une taille de " + taille + " cellules.");

        System.out.println("Contenu du tableau aléatoire :");
        afficherTableau(tableau);

        int min = valeurMin(tableau);
        int max = valeurMax(tableau);
        System.out.println("La valeur min trouvée = " + min);
        System.out.println("La valeur max trouvée = " + max);

        tableau = remplacerValeur(tableau, 12, 5);
        System.out.println("Après remplacement de la valeur 12 par la valeur 5 voici le contenu du tableau :");
        afficherTableau(tableau);

        int somme = sommeTableau(tableau);
        double moyenne = moyenneTableau(tableau);
        System.out.println("La somme des cellules du tableau = " + somme);
        System.out.println("La moyenne des cellules du tableau = " + String.format("%.2f", moyenne));

        int positionPremiere = premiereOccurrence(tableau, 13);
        int positionDerniere = derniereOccurrence(tableau, 8);
        System.out.println("La valeur 13 a été trouvée à la 1ère position N°" + positionPremiere);
        System.out.println("La valeur 8 a été trouvée à la dernière position N°" + positionDerniere);
    }
}
