import java.util.Arrays;
import java.util.Random;

public class ExerciceTableaux2 {
    public static final int MAX = 6;
    public static final int MIN = 1;
    public static void main(String[] args) {
    
        int total=0;

    Random rand = new Random();

        int[] MonTableaux = new int[10];

        for (int i = 0; i < MonTableaux.length; i++) {
            MonTableaux[i]=rand.nextInt(MAX-MIN+1)+MIN;
            total = total + MonTableaux[i];
        }
        Arrays.toString(MonTableaux);
        for (int i = 0; i < MonTableaux.length; i++) {
            System.out.println("cellule "+ i+": " +MonTableaux[i]);
        }
    }
}


    

