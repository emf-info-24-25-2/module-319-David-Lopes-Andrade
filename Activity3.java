import java.util.Base64;

public class Activity3 {
    public static final String PASSWORD = "bTBsZHU="; // Mot de passe encodé
    public static final char[] CHARACTERS = {
        '0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
        'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j',
        'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't',
        'u', 'v', 'w', 'x', 'y', 'z'
    };
    public static final int MAXCHAR = 5;

    public static void main(String[] args) {
        // Décoder le mot de passe
        byte[] decodedBytes = Base64.getDecoder().decode(PASSWORD);
        String decodedPwd = new String(decodedBytes);
        System.out.println("Mot de passe à trouver : " + decodedPwd);

        // Générer et tester les mots de passe
        for (int length = 0; length <= MAXCHAR; length++) {
            generatePasswords("", length, decodedPwd);
        }
    }

    private static void generatePasswords(String prefix, int length, String targetPassword) {
        // Si la longueur souhaitée est atteinte, tester le mot de passe
        if (length == 0) {
            if (testPassword(prefix)) {
                System.out.println("Mot de passe trouvé : " + prefix);
            }
            return;
        }
        
        // Boucle à travers tous les caractères possibles
        for (char character : CHARACTERS) {
            generatePasswords(prefix + character, length - 1, targetPassword);
        }
    }

    public static boolean testPassword(String password) {
        byte[] decodedBytes = Base64.getDecoder().decode(PASSWORD);
        String decodedPwd = new String(decodedBytes);
        return password.equals(decodedPwd);
    }
}

