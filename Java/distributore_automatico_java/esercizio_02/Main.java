/*
 * MICRO ESERCIZIO 2 - PAGAMENTO E RESTO
 *
 * Modifica il programma precedente.
 *
 * Dopo la scelta della categoria, chiedi all'utente il prezzo del
 * prodotto che desidera acquistare.
 *
 * Il prezzo deve essere maggiore di 0. Se non è valido, richiedilo
 * nuovamente.
 *
 * Chiedi quindi all'utente di inserire una moneta alla volta.
 *
 * Il distributore accetta soltanto queste monete:
 *
 * 10 centesimi
 * 20 centesimi
 * 50 centesimi
 * 100 centesimi
 * 200 centesimi
 *
 * Le monete da 1, 2 e 5 centesimi non sono accettate.
 *
 * Dopo ogni moneta valida, stampa il totale inserito e quanto manca
 * per raggiungere il prezzo del prodotto.
 *
 * Se la moneta non è accettata, comunicalo e non aggiungerla al
 * totale.
 *
 * Continua a richiedere monete finché il totale inserito non è
 * sufficiente per acquistare il prodotto.
 *
 * Al termine, stampa il prezzo, il totale inserito e quanto deve
 * ricevere di resto l'utente.
 *
 * Se il totale inserito corrisponde esattamente al prezzo, comunica
 * che non deve essere restituito alcun resto.
 */

package distributore_automatico_java.esercizio_02;

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
        ArrayList<Integer> MoneteLista = new ArrayList<>(Arrays.asList(10,20,50,100,200));

        int selezione = -1;
        boolean valido = false;
        int totale = 0;
        int prezzo = 0;
        int moneta =1;

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
            while (!valido){
                String scelta2 = IO.readln("\n Quanto costa quello che hai scelto?(in centesimi) ");
                prezzo = Integer.parseInt(scelta2);
                if (prezzo>0){
                    valido =true;
                }else {
                    IO.println("importo non valido, riprovare");
                }
            }

            IO.println("""
                    puoi inserire solo una moneta alla volta che sia tra queste:  * 10 centesimi * 20 centesimi * 50 centesimi * 100 centesimi * 200 centesimi""");


            while (totale < prezzo) {
                String scelta3 = IO.readln("\n Quale moneta vuoi inserire? (scrivi solo il numero) ");
                moneta = Integer.parseInt(scelta3);

                if (!MoneteLista.contains(moneta)) {
                    IO.println("Moneta non accettata.");
                } else {
                    totale = totale + moneta;

                   if (totale < prezzo) {
                        int quantoManca = prezzo - totale;
                        IO.println("Totale inserito: " + totale + " cent. Mancano: " + quantoManca + " cent.");
                    }
                }
            }


            IO.println("\n--- PAGAMENTO COMPLETATO ---");
            IO.println("Prezzo: " + prezzo + " cent.");
            IO.println("Totale inserito: " + totale + " cent.");

            if (totale == prezzo) {
                IO.println("Nessun resto da restituire.");
            } else {
                int resto = totale - prezzo;
                IO.println("Il tuo resto è di: " + resto + " cent.");
            }














        } while (selezione < 1 || selezione > lunghezzaLista);
    }
}

