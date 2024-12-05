package revisions.E1_2022_2023;

import java.util.Random;

public class EvalPratique {

    public final static int TEMPS_MIN = 35;
    public final static int TEMPS_MAX = 75;

    public static int[] genererTemps(int taille) {
        int[] tableauTemps = new int[taille];

        Random temps = new Random();
        for (int i = 0; i < tableauTemps.length; i++) {
            tableauTemps[i] = TEMPS_MIN + temps.nextInt(TEMPS_MAX - TEMPS_MIN + 1);
        }
        return tableauTemps;

    }

    public static int positionMeilleurTemps(int[] tabTemps) {
        int min = Integer.MAX_VALUE;
        int position = -1;

        for (int i = 0; i < tabTemps.length; i++) {
            if (tabTemps[i] < min) {
                min = tabTemps[i];
                position = i;
            }
        }
        return position;
    }

    public static String[] calculQualification(String[] riders, int[] tabTemps) {

        String[] ridersRestant = new String[riders.length / 2];
        for (int i = 0; i < ridersRestant.length; i++) {
            int indexMeilleurTemps = positionMeilleurTemps(tabTemps);
            ridersRestant[i] = riders[indexMeilleurTemps];
            tabTemps[indexMeilleurTemps] = Integer.MAX_VALUE;
        }
        return ridersRestant;

    }

    public static void main(String[] args) {
        String[] riders = new String[] { "Kilian", "Max", "Noé", "Beat", "André", "Alex", "John", "Fred" };
        int tour = 1;
        while (riders.length > 1) {
            int[] tabTemps = genererTemps(riders.length);
            switch (tour) {
                case 1:
                    System.out.println("Résultat du quart de final :");

                    break;
                case 2:
                    System.out.println("Résultat de la demi-finale :");
                    break;
                case 3:
                    System.out.println("Résultat de la finale :");
                    break;
                default:
                    System.out.println("Tour " + tour + " :");
            }
            for (int i = 0; i < riders.length; i++) {
                System.out.println(riders[i] + " : " + tabTemps[i] + " secondes");
            }
            System.out.println("--------------------");
            tour++;

            riders = calculQualification(riders, tabTemps);
        }
        System.out.println("Le gagnant de la compétition est : " + riders[0]);
    }
}
