package devoirs.devoir02;

import java.util.Random;

public class Devoirs02 {
    public static void main(String[] args) {
          final int CAPACITE_RESERVOIR_A = 3;
        final int CAPACITE_RESERVOIR_B = 5;
        
       
        int reservoirA = 0;
        int reservoirB = 0;
        
        Random random = new Random();
        
       
        int capaciteTotale = CAPACITE_RESERVOIR_A + CAPACITE_RESERVOIR_B;
        
        
        int remplissage = random.nextInt(capaciteTotale + 1);
        
        
        System.out.println("Quantité à remplir : " + remplissage + " litres");
        
      
        while (reservoirA + reservoirB < remplissage) {
           
            if (reservoirA < CAPACITE_RESERVOIR_A) {
                int espaceDisponibleA = CAPACITE_RESERVOIR_A - reservoirA;
                int litresRestants = remplissage - (reservoirA + reservoirB);
                int litresAjoutesA = Math.min(espaceDisponibleA, litresRestants);
                reservoirA += litresAjoutesA;
            }
            
            
            System.out.println("Réservoir A : " + reservoirA + " litres, Réservoir B : " + reservoirB + " litres");
            
            
            if (reservoirA + reservoirB >= remplissage) {
                break;
            }
            
        
            if (reservoirB < CAPACITE_RESERVOIR_B) {
                int espaceDisponibleB = CAPACITE_RESERVOIR_B - reservoirB;
                int litresRestants = remplissage - (reservoirA + reservoirB);
                int litresAjoutesB = Math.min(espaceDisponibleB, litresRestants);
                reservoirB += litresAjoutesB;
            }
            
            
            System.out.println("Réservoir A : " + reservoirA + " litres, Réservoir B : " + reservoirB + " litres");
        }
    }
}
    
    

