import java.util.Arrays;
import java.util.Random;

public class ExerciceTableaux3 {
    public static final int MAX = 6;
    public static final int MIN = 1;
    public static void main(String[] args) {
        

        Random rand = new Random();
        
        int[] MonTableaux = new int[10] ;
        double total = 0;
        



        
        for (int i = 0; i < MonTableaux.length; i++) {
            MonTableaux[i]=rand.nextInt(MAX-MIN+1)+MIN;
            total = total + MonTableaux[i];
        }
        
        double moyenne = total / MonTableaux.length;
        for (int i = 0; i<MonTableaux.length; i++) {
            System.out.println("celule "+ i +":"+ MonTableaux[i] );
        }

        System.out.format("La moyenne est: "+ moyenne);
        
    }}
