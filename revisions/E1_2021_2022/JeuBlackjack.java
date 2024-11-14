package revisions.E1_2021_2022;

public class JeuBlackjack {

    // Déclaration des constantes MIN et MAX
    static final int MIN = 2;
    static final int MAX = 14;

    public static void main(String[] args) {
        // 6.1 Déclaration et création du tableau joueurs
        String[] joueurs = {"Jacques", "Pierre", "Paul","David","cesar","theo","bartosz"};

        // 6.2 Déclaration et création du tableau scores de la même taille que joueurs
        int[] scores = new int[joueurs.length];  // scores aura la même taille que joueurs

        // 6.3 Déclaration de la variable jeuTermine
        boolean jeuTermine = false;

        // 6.4 Tant que le jeu n'est pas terminé (jeuTermine == false)
        while (!jeuTermine) {
            // 6.4.1 Parcours de chaque joueur
            for (int i = 0; i < joueurs.length; i++) {
                // 6.4.1.1 Appel à la méthode tirerUneCarte() et stockage du résultat dans carte
                int carte = tirerUneCarte();

                // 6.4.1.2 Mise à jour du score du joueur en fonction de la carte
                if (carte > 10) {
                    scores[i] += 11;  // Si la carte est > 10 (valet, dame, roi, as), on ajoute 11
                } else {
                    scores[i] += carte;  // Sinon, on ajoute la valeur de la carte au score
                }

                // 6.4.1.4 Appel à la méthode donnerNomCarte() et stockage du résultat dans nomCarte
                String nomCarte = donnerNomCarte(carte);

                // 6.4.1.5 Affichage du nom du joueur et du nom de la carte tirée
                System.out.println(joueurs[i] + " a tiré la carte " + nomCarte);

                // 6.4.1.6 Affichage du nouveau score du joueur
                System.out.println("   Nouveau score : " + scores[i]);

                // 6.4.1.7 Vérification si un joueur a gagné (score == 21)
                if (scores[i] == 21) {
                    System.out.println(joueurs[i] + " a gagné !");
                    jeuTermine = true;  // Le jeu est terminé
                    break;  // On quitte la boucle des joueurs dès qu'il y a un gagnant
                }

                // 6.4.1.8 Vérification si un joueur a dépassé 21 (score > 21)
                if (scores[i] > 21) {
                    System.out.println(joueurs[i] + " a dépassé 21. Le jeu est terminé.");
                    jeuTermine = true;  // Le jeu est terminé
                    int gagnantIndex = determinerIndexGagnant(scores);  // Appel de la méthode pour déterminer le gagnant
                    System.out.println(joueurs[gagnantIndex] + " a gagné !");
                    break;  // On quitte la boucle des joueurs dès qu'il y a un gagnant
                }
            }
        }
    }

    // 3. Méthode tirerUneCarte() : génère un nombre aléatoire entre MIN et MAX
    public static int tirerUneCarte() {
        return (int) (Math.random() * (MAX - MIN + 1)) + MIN;  // Valeur entre MIN (2) et MAX (14)
    }

    // 5. Méthode donnerNomCarte() : retourne le nom de la carte en fonction de sa valeur
    public static String donnerNomCarte(int carte) {
        if (carte >= 2 && carte <= 10) {
            return String.valueOf(carte);  // Si la carte est entre 2 et 10, retourne la valeur nominale
        }
        switch (carte) {
            case 11:
                return "valet";
            case 12:
                return "dame";
            case 13:
                return "roi";
            case 14:
                return "as";
            default:
                return "indéterminé";  // Si la carte ne correspond à aucune valeur attendue
        }
    }

    // 4. Méthode determinerIndexGagnant() : détermine l'index du joueur gagnant
    public static int determinerIndexGagnant(int[] scores) {
        int gagnantIndex = -1;
        int scoreMaximal = -1;

        // On cherche le joueur dont le score est le plus proche de 21, sans dépasser 21
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] <= 21 && scores[i] > scoreMaximal) {
                scoreMaximal = scores[i];
                gagnantIndex = i;
            }
        }

        return gagnantIndex;
    }
}
