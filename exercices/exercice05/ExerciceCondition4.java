package exercices.exercice05;

public class ExerciceCondition4 {
    public static void main(String[] args) {
    int temperature=89;
if (temperature < -10) System.out.println("Il fait trés froid");
else if (temperature <= -10) System.out.println("il fait froid");
else if(0 <= temperature && temperature <= 25) System.out.println("il fait normal");
else if(25<= temperature && temperature >=35) System.out.println("il fait trés chaud");

}
    
}
