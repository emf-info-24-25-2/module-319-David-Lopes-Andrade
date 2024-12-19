import java.util.Random;

public class App {
    public static int NBRE_ESSAIS =10000000;
    public static void main(String[] args) throws Exception {
         int pointsDansLeCercle = 0;
        Random random = new Random();

        // Générer les points aléatoires
        for (int i = 0; i < NBRE_ESSAIS; i++) {
            // Coordonnées x et y générées aléatoirement entre 0 et 1
            double x = random.nextDouble();
            double y = random.nextDouble();

            double hypothenuse =Math.sqrt(x*x+y*y);
            // Vérifier si le point est dans le cercle
            if (hypothenuse <= 1) {
                pointsDansLeCercle++;
            }
        }

        // Estimer la valeur de π
        double piEstime = 4.0 * (double)pointsDansLeCercle / NBRE_ESSAIS;

        // Afficher les résultats
        System.out.println("Nombre d'essais : " + NBRE_ESSAIS);
        System.out.println("Points dans le cercle : " + pointsDansLeCercle);
        System.out.println("Estimation de pi : " + piEstime);
    }
}
