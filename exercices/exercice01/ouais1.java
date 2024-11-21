package exercices.exercice01;

public class ouais1 {
    public static int compterFrequence(int[] tableau, int valeur) {
        int count = 0;
        for (int v : tableau) {
            if (v == valeur) {
                count++;
            }
        }
        return count;
    }
    
    public static void main(String[] args) {
        
    }
}
