package Fattoriale;

import java.util.Scanner;

public class Fattoriale {

    /***Obiettivo:** Chiedere all'utente un numero n e calcola il suo fattoriale.
     * fattoriale= prodotto di tutti gli interi positivi da 1 a n

     **Esempio:** n = 5

     **Output:** 5x4x3x2x1 = 120
     */
    void main (){

        Scanner scan = new Scanner(System.in);

        System.out.println("Inserisci il numero di cui vuoi sapere il suo fattoriale");
        int numero = scan.nextInt();

        long fattorialeNumero = 1; //1 è il mio elemento neutro nella moltiplicazione

        for(int i = 1; i <= numero; i++){
            fattorialeNumero *= i;
        }
        System.out.println("Il fattoriale del numero " + numero + " è : " + fattorialeNumero);
        scan.close();
    }
}
