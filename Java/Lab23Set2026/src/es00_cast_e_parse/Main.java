package es00_cast_e_parse;

/*
 * Crea due String contenenti due numeri interi, uno pari e uno dispari.
 * Prova a convertirle in int con un cast e osserva l'errore di compilazione.
 * Usa il parse per convertire a int.
 * Calcola la loro media e salvala in una variabile double.
 * Stampa il risultato e osserva.
 */
public class Main {
    public static void main(String[] args) {

        String numero1 = "17";
        String numero2 = "20";

        int DisParis = Integer.parseInt(numero1);
        int Paris = Integer.parseInt(numero2);

        int somma = DisParis+Paris;
        double media = ((double)somma/2);

        IO.println(media);
    }
}
