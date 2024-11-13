package devoirs.devoir06;

import java.util.Random;

public class Devoirs06 {

    public static final int TAILLE_TABLEAU = 20;
    public static final int VALEUR_MIN = 0;
    public static final int VALEUR_MAX = 50;
    public static final int VALEUR_RECHERCHEE = 7;

    public static int[] genereTableau(int taille, int min, int max) {

        int[] tableau = new int[taille];

        Random random = new Random();

        for (int i = 0; i < taille; i++) {
            tableau[i] = random.nextInt(max - min + 1) + min;
        }

        return tableau;

    }
    
    public static void main(String[] args) {
        //je pense que vous arrivez à faire un peu plus que ça :-)

    }

}
