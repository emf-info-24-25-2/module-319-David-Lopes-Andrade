public class App {
    public static void main(String[] args) throws Exception {
        String maChaineDeCaractere ="Voici du contenu stocké dans un String.";
System.out.println("Nombre de caractères contenu dans la variable maChaineDeCaractere : "+maChaineDeCaractere.length());

System.out.println("Le mot \"contenu\" commence à la position : " +maChaineDeCaractere.indexOf("contenu"));

char result = maChaineDeCaractere.charAt(17);
System.out.println("Le position 17 contient la lettre :" +result);

String monPrenom = "David";
for (int i = 0; i < monPrenom.length(); i++) {
    System.out.println("La lettre a la position "+ i +" est "+monPrenom.charAt(i));

    }
    if (monPrenom.contains("test")) {
        System.out.println("La chaîne de caractère \"" + monPrenom + "\" contient le texte \"test\".");
    } else {
        System.out.println("La chaîne de caractère \"" + monPrenom + "\" ne contient pas le texte \"test\".");

}
}
}