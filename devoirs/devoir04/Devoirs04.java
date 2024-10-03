package devoirs.devoir04;

public class Devoirs04 {
    public static void main(String[] args) {
    int year=2020;
    int month=2;
    int day= 29;
    String nomDuMois =" ";
    System.out.println("la date entrée est le "+ day+" " + month+" " + year);
//on va commencer par vérifier si les jour les mois et l'années sont dans les limites
    if (day<1&&day>31) {
        System.out.println("Le jour "+day+" est hors limites" );
    } 
    else {
        
        if (month<1&&day>12) {
        System.out.println("le mois "+month+" est hors limites");

    } 
    else{
        switch (month) {
            case 2:
                //vérifier si février a 28 ou 29 jour
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    if (day>29) {
                        System.out.println("février n'as que 29 jours");
                    }                  
                }else {
                    if (day>28) {
                        System.out.println("février n'as que 28 jours");
                    }
                }
                break;
            case 4: case 6: case 9: case 11: // Mois ayant 30 jours
                if (day > 30) {
                    System.out.println("le jour est hors limites");
                
                        
                    
                }
                
                break;
            default:
                break;
        }
        //dire a quelle mois correspond le chiffre
    
        switch (month) {
            case 1: nomDuMois="janvier"; break;
            case 2: nomDuMois="février";break;
            case 3:nomDuMois="mars"; break;
            case 4:nomDuMois="avril"; break;
            case 5:nomDuMois="mai"; break;
            case 6:nomDuMois="juin"; break;
            case 7:nomDuMois="juillet"; break;
            case 8:nomDuMois="aout"; break;
            case 9:nomDuMois="septembre"; break;
            case 10:nomDuMois="octobre"; break;
            case 11:nomDuMois="novembre"; break;
            case 12:nomDuMois="décembre"; break;
            default:System.out.println("Mois hors limites");
        
        

        }
    }
    }

    System.out.println("La date formatée est le "+day+" "+nomDuMois+" "+ year);
        
    }
    
}


        
    
    

