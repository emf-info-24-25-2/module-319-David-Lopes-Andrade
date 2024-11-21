package revisions.E2_2022_2023;
import java.util.Scanner;
//j'avais deja fait l'exercice, donc je l'ai refait pour voir ou j'avais plus de peine
public class SalleDeSpectacle1 {
    static final int PRIX_CATEGORIE_UN = 25;
    static final int PRIX_CATEGORIE_DEUX = 18;
    static final int PRIX_CATEGORIE_TROIS = 12;
    static final int[] CATEGORIE_SALLE = {3, 3, 2, 2, 1, 1, 2, 2, 3, 3};
    public static void main(String[] args) {// j'ai des doute quand je dois appeller les methode je suis jamais sur de comment faire
        Scanner scanner = new Scanner(System.in);

        
        boolean[] occupationSalle = new boolean[CATEGORIE_SALLE.length];
        
        
        int commande = -1;

        
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
    public static void afficherTarifs() {
        System.out.println("Tarifs des catégories :");
        System.out.println("Catégorie 1 : " + PRIX_CATEGORIE_UN + " CHF");
        System.out.println("Catégorie 2 : " + PRIX_CATEGORIE_DEUX + " CHF");
        System.out.println("Catégorie 3 : " + PRIX_CATEGORIE_TROIS + " CHF");
}
public static void afficherSalle(boolean[] occupationSalle) {
    System.out.println("Occupation de la salle");

for (int i = 0; i < CATEGORIE_SALLE.length; i++) {
    System.out.print(CATEGORIE_SALLE[i] + " ");
}
System.out.println();

for (boolean place : occupationSalle) {
    if (place) {
        System.out.print("O "); 
    } else {
        System.out.print("X "); 
    }
}
System.out.println();
}
public static int trouverPlace(int categorie, boolean[] occupationSalle){
    for (int i =0;i<CATEGORIE_SALLE.length;i++){
    if (CATEGORIE_SALLE[i] == categorie && !occupationSalle[i]) {
    System.out.println(i + " est la premiere place libre");
    return i;
    }
}
return -1; 
}
public static boolean[] commanderBillet(boolean[] occupationSalle){ //j'ai eu de la peine pour comprendre comment utiliser le scanner
    Scanner scanner = new Scanner(System.in);  


System.out.println("Quelle catégorie voulez vous ? :");
int categorie =scanner.nextInt();

if (categorie >= 1 && categorie <= 3){
    int positionPlace = trouverPlace(categorie, occupationSalle);

            if (positionPlace != -1) {
                occupationSalle[positionPlace] = true;
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
                
                System.out.println("Aucune place disponible.");
            }
        }else{
            System.out.println("Cette catégorire n'existe pas");
        }

return occupationSalle;

}
}