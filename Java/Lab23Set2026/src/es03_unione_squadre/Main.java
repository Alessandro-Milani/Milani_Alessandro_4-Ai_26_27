package es03_unione_squadre;

import java.util.ArrayList;
import java.util.Arrays;

/*
 * Crea due liste che rappresentano due squadre di giocatori.
 * Inserisci almeno tre nomi in ciascuna squadra.
 * Crea una terza lista e unisci le squadre.
 * Inserisci il capitano all'inizio della nuova lista.
 * Cerca la posizione di un giocatore scelto da te.
 * Infine rimuovi dalla lista tutti i membri di una delle due squadre.
 */
public class Main {
    public static void main(String[] args) {

        ArrayList<String> Squadra1 = new ArrayList<>(Arrays.asList("Totti", "Messi","Neymar"));
        ArrayList<String> Squadra2 = new ArrayList<>(Arrays.asList("Leao", "Ramos", "Falcone"));

        ArrayList<String> Squadra3 = new ArrayList<>();
        Squadra3.addAll(Squadra1);
        Squadra3.addAll(Squadra2);
        Squadra3.add(0,"Ronaldo il fenomeno");
        IO.println(Squadra3);

        IO.println("il tuo quinto giocatore è: " + Squadra3.get(4));

        Squadra3.removeAll(Squadra1);




    }
}
