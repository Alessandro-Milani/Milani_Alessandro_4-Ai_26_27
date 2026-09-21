/*
 * MICRO ESERCIZIO 1 - SCELTA DELLA CATEGORIA
 *
 * Scrivi un programma che simuli la selezione iniziale di un
 * distributore automatico.
 *
 * Mostra all'utente queste categorie:
 *
 * 1 -> Cibi
 * 2 -> Bevande
 * 3 -> Caffè
 *
 * Chiedi all'utente di inserire il numero della categoria desiderata.
 *
 * Se il numero è valido, stampa il nome della categoria scelta.
 *
 * Se il numero non è valido, comunica l'errore e richiedi nuovamente
 * la scelta.
 */

package distributore_automatico_java.esercizio_01;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Dichiarazione delle categorie
        ArrayList<String> categorieMacchinetta = new ArrayList<>(Arrays.asList("Cibi", "Bevande", "Caffè"));// Arrays.asList() = lista con numero definito di valori
        int lunghezzaLista = categorieMacchinetta.size();
        /*categorieMacchinetta.add("cibi"); aggiungere elementi lista
        categorieMacchinetta.add("bevande");
        categorieMacchinetta.add("caffè");*/

        int selezione = -1;

        do {
            IO.println("\n--- MENU CATEGORIE ---");

            for (int i = 0; i < lunghezzaLista; i++) {
                String categoria = categorieMacchinetta.get(i);
                IO.print((i + 1) + " -> ");
                IO.println(categoria);
            }

            String scelta = IO.readln("\nCosa scegli? ");
            selezione = Integer.parseInt(scelta);


            if (selezione >= 1 && selezione <= lunghezzaLista) {
                String categoriaScelta = categorieMacchinetta.get(selezione - 1);
                IO.println("Hai scelto: " + categoriaScelta);
            } else {
                IO.println("Errore: Selezione non valida. Riprova.");
            }

        } while (selezione < 1 || selezione > lunghezzaLista);
    }
}
