package Tabellina;

import java.util.Scanner;

public class Tabellina {

    /***Obiettivo:** Chiedere all'utente di quale numero stampare la tabellina e fino a quale numero arrivare.

     **Esempio:** numeroTabellina 5, numeroFineTabellina 10

     **Output:** 0, 5, 10, 15, 20, 25, 30, 35, 40, 45, 50
     */
    void main () {
        Scanner scan = new Scanner(System.in);

        System.out.println("DIndicami di quale numero vuoi vedere la taballina");
        int sceltaUtente = scan.nextInt();

        System.out.println("Fino a quale numero vuoi che moltiplichi?");
        int numeroMassimo = scan.nextInt();

        for(int i = 0; i <= numeroMassimo; i++){
            int risultato = sceltaUtente * i;
            System.out.println(sceltaUtente + " x " + i + " = " + risultato);
        }
        scan.close();
    }

}
