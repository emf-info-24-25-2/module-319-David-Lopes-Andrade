package exercices.ExempleIfSwitch;

public class IfSwitch {
    public static void main(String[] args) {
        int note = 6;
        if (note < 4) {
            System.out.println("ma note est insuffisante.");
        } else if (note < 6) {
            System.out.println("je devrais travailler");
        } else {
            System.out.println("ma note est parfaite.");
        }
        System.out.println("Ma note est  " + note);

        switch (note) {
            case 1:
                System.out.println("j'ai triche c'est mal");
                break;
            case 2:
                System.out.println("y'as du bouloux");
                break;
            case 3:
                System.out.println("encore un effort");
                break;
            case 4:
                System.out.println("just juste");
                break;
            case 5:
                System.out.println("bien");
                break;
            case 6:
                System.out.println("parfait");

                break;

            default:
            System.out.println("note incoherente");
                break;
        }
    }
}
