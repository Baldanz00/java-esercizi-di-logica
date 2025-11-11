package SommaDegliElementi;

public class Somma {
    /***Obiettivo:** Calcola la somma di tutti gli elementi di un array.

     **Esempio:** int [] a = {1, 2, 3, 4, 5}

     **Output:** 15
     */
    void main (){
        int[] arrayNumerico = {5,10,2,4,25};

        int sommaArray = 0;

        for(int i = 0; i < arrayNumerico.length; i++){
            sommaArray = sommaArray + arrayNumerico[i];
        }
        System.out.println("La somma degli elementi dell'array è: " + sommaArray);
    }
}
