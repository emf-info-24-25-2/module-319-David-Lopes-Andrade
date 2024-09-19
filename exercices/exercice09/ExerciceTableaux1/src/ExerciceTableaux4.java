public class ExerciceTableaux4 {
    public static void main(String[] args) {

        int[] MonTableaux = new int [5];
        MonTableaux[0] = 17;

    for (int i= 1; i <MonTableaux.length;i++) {
        MonTableaux[i] = MonTableaux[i - 1] + 1;

        System.out.println(MonTableaux[i]);
    
    }

    
       
        
       
    }
}

