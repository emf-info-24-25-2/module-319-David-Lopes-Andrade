package revisions.E2_2022_2023;
//j'avais deja fait cet exercice mais je l'ai refait en meme temp pour voir ou j'avais des difficultés
import java.util.Scanner;

public class SalleDeSpectacle {

    // Constantes pour les prix des catégories
    static final int PRIX_CATEGORIE_UN = 25;
    static final int PRIX_CATEGORIE_DEUX = 18;
    static final int PRIX_CATEGORIE_TROIS = 12;

    // Tableau constant pour la catégorie des sièges dans la salle
    static final int[] CATEGORIE_SALLE = {3, 3, 2, 2, 1, 1, 2, 2, 3, 3};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialisation du tableau d'occupation de la salle
        boolean[] occupationSalle = new boolean[CATEGORIE_SALLE.length];
        
        // Variable de commande
        int commande = -1;

        // Boucle principale du menu
        while (commande != 0) {
            System.out.println("--------------------------------------------------");
            System.out.println("1 = Commander un billet, 2 = Afficher les tarifs, 3 = Afficher l'état de la salle, 0 = Quitter");
            commande = scanner.nextInt();

            switch (commande) {
                case 0:
                    System.out.println("Au revoir");
                    break;
                case 1:
                    occupationSalle = commanderBillet(occupationSalle);
                    break;
                case 2:
                    afficherTarifs();
                    break;
                case 3:
                    afficherSalle(occupationSalle);
                    break;
                default:
                    System.out.println("Commande inconnue");
            }
        }

        scanner.close();
    }

    // Méthode pour afficher les tarifs
    public static void afficherTarifs() {
        System.out.println("Tarifs des catégories :");
        System.out.println("Catégorie 1 : " + PRIX_CATEGORIE_UN + " CHF");
        System.out.println("Catégorie 2 : " + PRIX_CATEGORIE_DEUX + " CHF");
        System.out.println("Catégorie 3 : " + PRIX_CATEGORIE_TROIS + " CHF");
    }

    // Méthode pour afficher l'état de la salle
    public static void afficherSalle(boolean[] occupationSalle) {
        System.out.println("Occupation de la salle");

        // Affichage des catégories des sièges
        for (int i = 0; i < CATEGORIE_SALLE.length; i++) {
            System.out.print(CATEGORIE_SALLE[i] + " ");
        }
        System.out.println();

        // Affichage des places occupées (O) ou libres (X)
        for (boolean place : occupationSalle) {
            if (place) {
                System.out.print("O "); // Si la place est occupée
            } else {
                System.out.print("X "); // Si la place est libre
            }
        }
        System.out.println();
    }

    // Méthode pour trouver une place libre dans une catégorie spécifique
    public static int trouverPlace(int categorie, boolean[] occupationSalle) {
        for (int i = 0; i < CATEGORIE_SALLE.length; i++) {
            if (CATEGORIE_SALLE[i] == categorie && !occupationSalle[i]) {
                return i; // Retourne l'index de la première place libre
            }
        }
        ; // Retourne -1 si aucune place libre n'est trouvée
        return categorie;
    }

    // Méthode pour commander un billet
    public static boolean[] commanderBillet(boolean[] occupationSalle) {
        Scanner scanner = new Scanner(System.in);

        // Demande à l'utilisateur de choisir une catégorie
        System.out.println("Quelle catégorie voulez-vous :");
        int categorie = scanner.nextInt();

        if (categorie >= 1 && categorie <= 3) {
            // Trouver une place libre pour la catégorie choisie
            int positionPlace = trouverPlace(categorie, occupationSalle);

            if (positionPlace != -1) {
                // La place est disponible, on la réserve
                occupationSalle[positionPlace] = true;

                // Affichage du prix
                int prix = 0;
                switch (categorie) {
                    case 1:
                        prix = PRIX_CATEGORIE_UN;
                        break;
                    case 2:
                        prix = PRIX_CATEGORIE_DEUX;
                        break;
                    case 3:
                        prix = PRIX_CATEGORIE_TROIS;
                        break;
                }
                System.out.println("Votre place est réservée et coûte " + prix + " CHF.");
            } else {
                // Si aucune place n'est disponible
                System.out.println("Aucune place disponible.");
            }
        } else {
            // Si la catégorie choisie n'est pas valide
            System.out.println("Cette catégorie n'existe pas.");
        }
        
        return occupationSalle; // Retourne l'état de l'occupation de la salle
    }
}


