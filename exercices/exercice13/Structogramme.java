package exercices.exercice13;

public class Structogramme {

    public static void main(String[] args) {
        // Le mot de passe à trouver (par exemple "123" ou "567")
        String motDePasseCorrect = "123456789"; // Changez-le pour tester d'autres mots de passe

        // Démarrer l'attaque brute-force
        System.out.println("Démarrage de l'attaque par force brute...");

        // Tester toutes les combinaisons possibles de 1 à 4 chiffres
        for (int longueur = 1; longueur <= 9; longueur++) {
            // Générer toutes les combinaisons possibles pour un mot de passe de la longueur
            // donnée
            for (int i = 0; i < Math.pow(10, longueur); i++) {

                // Formater le nombre pour qu'il ait toujours la longueur correcte (en ajoutant
                // des zéros devant si nécessaire)
                String combinaison = String.format(longueur + " " + i);
                System.out.println("combinaison testé " + combinaison);
                // Vérifier si la combinaison correspond au mot de passe
                if (combinaison.equals(motDePasseCorrect)) {
                    System.out.println("Mot de passe trouvé : " + combinaison);
                    return; // Quitter l'attaque dès que le mot de passe est trouvé
                }

            }
        }

        // Si le mot de passe est trouvé, on arrête l'attaque
        System.out.println("Fin de l'attaque.");
    }
}
