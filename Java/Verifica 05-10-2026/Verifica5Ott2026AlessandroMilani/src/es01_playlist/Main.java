package es01_playlist;
import java.util.ArrayList;
import java.util.Locale;

public class Main {
    public static void main (String[] args){

        ArrayList<String> ListaPartecipanti = new ArrayList<>();
        boolean Corretto = false;
        boolean Uscita = false;

        while(!Uscita) {
            IO.println("----MENU----");
            IO.println("1 - Aggiungi un nuovo partecipante");
            IO.println("2 - Visualizza tutti i partecipanti");
            IO.println("3 - Eliminare un partecipante");
            IO.println("4 - Verificare se un partecipante è presente");
            IO.println("5 - Visualizzare il numero di partecipanti");
            IO.println("0 - Uscita");

            String SceltaUtente = IO.readln("Che cosa vuoi fare? ");
            switch (SceltaUtente){

                case "1"->{
                    Corretto=false;
                    while(!Corretto) {

                        String NomeDaInserire = IO.readln("Che nome vuoi agiungere all'elenco? ");
                        NomeDaInserire=NomeDaInserire.toLowerCase();
                        if (ListaPartecipanti.contains(NomeDaInserire)){
                            IO.println("Nome già presente in archivio");
                        }
                        else{
                            IO.println("Nome inserito con successo");
                            ListaPartecipanti.add(NomeDaInserire);
                            Corretto=true;
                        }
                    }


                }

                case "2" -> {
                    if (!ListaPartecipanti.isEmpty()) {
                        for (int i = 0; i < ListaPartecipanti.size(); i++) {
                            IO.println("- " + ListaPartecipanti.get(i));

                        }
                    }
                    else{
                        IO.println("La lista è vuota al momento");
                    }

                }

                case "3" -> {
                    Corretto=false;
                    while(!Corretto) {
                        String NomeDaEliminare = IO.readln("Quale partecipante vuoi eliminare? ");
                        NomeDaEliminare = NomeDaEliminare.toLowerCase();
                        if (ListaPartecipanti.contains(NomeDaEliminare)) {
                            ListaPartecipanti.remove(NomeDaEliminare);
                            IO.println("Nominativo eliminato con successo ! ");
                            Corretto = true;
                        } else {
                            IO.println("Nominativo inserito non trovato, riprovare");
                        }
                    }


                }
                case "4" ->{
                    String NomeDaCercare = IO.readln("Di quale nome vuoi verificare la presenza ? ");
                    NomeDaCercare = NomeDaCercare.toLowerCase();
                    if (ListaPartecipanti.contains(NomeDaCercare)) {
                        IO.println("Il nominativo è presente in lista ! ");
                    }
                    else {
                        IO.println("Il nominativo non è presente in lista");
                    }
                }
                case "5" -> {
                    IO.println("Per ora il numero degli iscritti ammonta a " + ListaPartecipanti.size());


                }

                case "0" -> {
                    IO.println("Bye Bye");
                    Uscita=true;
                }
                case null, default -> {
                    IO.println("scelta non valida, riprovare");
                }

            }














        }





    }
}
