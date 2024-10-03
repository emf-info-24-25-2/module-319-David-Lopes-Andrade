public class Activity4 {
    
    public static void main(String[] args) {
        // Obtenez l'heure de début
long startTime = System.nanoTime();

// VOTRE CODE de la méthode main ICI

// Obtenez l'heure de fin
long endTime = System.nanoTime();

// Calculez la durée d'exécution en nanosecondes
long duration = endTime - startTime;

// Affichez la durée d'exécution en millisecondes
System.out.println("Temps d'exécution : " + (duration / 1000000) + " ms");

    }
}
