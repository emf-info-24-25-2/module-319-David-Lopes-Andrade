package exercices;

public class test {
    
        public static void main(String[] args) {
            // Déclaration d'un tableau d'entiers de taille 10
            int[] tableau = new int[10];
            
            // Valeur à remplir dans le tableau
            int valeur = 7;
    
            // Remplir le tableau avec la même valeur (ici 7)
            for (int i = 0; i < tableau.length; i++) {
                tableau[i] = valeur;
            }
            
            // Affichage du contenu du tableau pour vérifier
            System.out.println("Contenu du tableau après remplissage :");
            for (int i = 0; i < tableau.length; i++) {
                System.out.print(tableau[i] + " ");
            }
        }
    }
    
