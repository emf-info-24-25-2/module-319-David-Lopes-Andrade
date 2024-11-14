package devoirs.devoir09;

import java.util.Random;

public class GenerateurLoto {

    // Déclaration des constantes
    public static final int NBRE_CHIFFRES = 6;
    public static final int MIN = 0;
    public static final int MAX = 42;

    // Méthode pour générer un tirage de loto sans doublons
    public static int[] genereTirage(int nbreChiffres, int min, int max) {
        Random random = new Random();
        int[] tirage = new int[nbreChiffres]; // Tableau pour stocker les chiffres du tirage
        int count = 0;

        // Boucle pour générer des chiffres
        while (count < nbreChiffres) {
            int chiffre = random.nextInt(max - min + 1) + min; // Génère un chiffre aléatoire dans la plage [min, max]

            // Vérification si le chiffre est déjà présent dans le tirage
            boolean doublon = false;
            for (int i = 0; i < count; i++) {
                if (tirage[i] == chiffre) {
                    doublon = true; // Si le chiffre est déjà présent, marquer comme doublon
                    break;
                }
            }

            // Si pas de doublon, on ajoute le chiffre dans le tirage
            if (!doublon) {
                tirage[count] = chiffre;
                count++;
            }
        }

        return tirage; // Retourner le tirage
    }

    public static void main(String[] args) {
        // Appel de la méthode genereTirage
        int[] tirage = genereTirage(NBRE_CHIFFRES, MIN, MAX);

        // Affichage du tirage généré
        System.out.println("Tirage Loto :");
        for (int chiffre : tirage) {
            System.out.print(chiffre + " ");
        }
    }
}
