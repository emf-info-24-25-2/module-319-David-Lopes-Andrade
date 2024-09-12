import java.util.Arrays;

public class ExerciceTableaux3 {
    public static void main(String[] args) {
        
        int[] MonTableaux = new int[] {1,5,5,4,6,3,1,5,6,4};
        double total = 0;



        Arrays.toString(MonTableaux);
        for (int i = 0; i < MonTableaux.length; i++) {
            total = total + MonTableaux[i];
        }
        double moyenne = total / MonTableaux.length;
        
        System.out.format("La moyenne est: %.2f", moyenne);
            



    
    
    }}
