package devoirs.devoir08;

import java.util.Random;

public class GenerateurMotDePasse {

    // Déclaration des constantes
    public static  String[] CARACTERES = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"};
    public static  int NBR_ESSAI = 5;
    public static  int TAILLE_MOT_DE_PASSE = 15;

    // Méthode pour générer un mot de passe
    public static String genereMotDePasse(int tailleMotDePasse) {
        Random random = new Random(); // Générateur de nombres aléatoires
        String resultat = ""; // Variable qui va contenir le mot de passe généré

        // Boucle qui génère un mot de passe de la taille spécifiée
        while (resultat.length() < tailleMotDePasse) {
            int indexAleatoire = random.nextInt(CARACTERES.length); // Choisir une position aléatoire dans CARACTERES
            resultat += CARACTERES[indexAleatoire]; // Ajouter la lettre à la chaîne de caractères
        }
        return resultat; // Retourner le mot de passe généré
    }

    public static void main(String[] args) {
        // Boucle qui effectue NBR_ESSAI essais de génération de mot de passe
        for (int i = 0; i < NBR_ESSAI; i++) {
            String motDePasse = genereMotDePasse(TAILLE_MOT_DE_PASSE); // Appel de la méthode pour générer le mot de passe
            System.out.println(motDePasse); // Affichage du mot de passe généré
        }
    }
}
