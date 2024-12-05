package devoir10;

import java.util.Random;

public class MonteCarloPI {
    // Constante : nombre d'essais
    public static final int NBRE_ESSAIS = 100_000;

    public static void main(String[] args) {
        int pointsDansLeCercle = 0;
        Random random = new Random();

        // Générer les points aléatoires
        for (int i = 0; i < NBRE_ESSAIS; i++) {
            // Coordonnées x et y générées aléatoirement entre 0 et 1
            double x = random.nextDouble();
            double y = random.nextDouble();

            // Vérifier si le point est dans le cercle
            if (x * x + y * y <= 1) {
                pointsDansLeCercle++;
            }
        }

        // Estimer la valeur de π
        double piEstime = 4.0 * pointsDansLeCercle / NBRE_ESSAIS;

        // Afficher les résultats
        System.out.println("Nombre d'essais : " + NBRE_ESSAIS);
        System.out.println("Points dans le cercle : " + pointsDansLeCercle);
        System.out.println("Estimation de π : " + piEstime);
    }
}
