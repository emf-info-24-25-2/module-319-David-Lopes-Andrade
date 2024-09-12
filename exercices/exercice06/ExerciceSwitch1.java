package exercices.exercice06;

public class ExerciceSwitch1 {
    public static void main(String[] args) {
        int noteDuModule = 6;
        if (noteDuModule <=1) System.out.println("Travail non rendu");
        else if (noteDuModule <=2) System.out.println("trés insuffisant");
        else if (noteDuModule <=3) System.out.println("Insuffisant");
        else if (noteDuModule <=4)System.out.println("suffisant");
        else if (noteDuModule <=5)System.out.println("pas mal");
        else if (noteDuModule <=6)System.out.println("parfait");
    }
}
