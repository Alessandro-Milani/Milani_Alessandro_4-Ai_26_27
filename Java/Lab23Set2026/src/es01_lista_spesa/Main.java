package es01_lista_spesa;

import java.util.ArrayList;
import java.util.Arrays;

/*
 * Crea una lista della spesa e inserisci almeno quattro prodotti.
 * Aggiungi un nuovo prodotto in fondo alla lista.
 * Inserisci poi un prodotto in una posizione precisa.
 * Modifica uno dei prodotti già presenti usando il suo indice.
 * Verifica se la lista contiene "latte".
 * Infine stampa tutti i prodotti e il numero totale di elementi.
 */
public class Main {
    public static void main(String[] args) {

        ArrayList<String>ListaSpesa = new ArrayList<>(Arrays.asList("pane","formaggio","prosciutto crudo","pasta"));
        ListaSpesa.add(0,"yogurt");
        ListaSpesa.set(1,"pollo");
        if (ListaSpesa.contains("latte")){
            IO.println("nella tua lista c'è il latte");
        }else{
            IO.println("nella tua lista non c'è il latte");
        }

            IO.println(ListaSpesa);
            IO.println("la tua lista contiene "+ListaSpesa.size()+" elementi");

    }
}
