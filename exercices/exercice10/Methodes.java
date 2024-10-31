package exercices.exercice10;

public class Methodes {

  public static void math() {
    int minimum = Math.min(5, 10);
    int maximum = Math.max(10, 25);
    double puissance = Math.pow(2, 3);
    double racine = Math.sqrt(16);
    int valeurAbsolue = Math.abs(-10);
    System.out.println(minimum);
    System.out.println(maximum);
    System.out.println(puissance);
    System.out.println(racine);
    System.out.println(valeurAbsolue);

  }

  public static void direBonjour() {
    System.out.println("Bonjour");

    System.out.println();
  }

  public static void dire(String nom) {
    System.out.println();
  }

  public static void main(String[] args) {

    math();
    direBonjour();
  }

}
