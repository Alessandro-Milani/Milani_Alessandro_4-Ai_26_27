
void main() {

    ArrayList<String> Lista = new ArrayList<>();
    boolean uscita = false;
    while (!uscita) {
        IO.println("----MENU'----");
        IO.println("1 - Aggiungi un nuovo prodotto");
        IO.println("2 - Visualizza tutti i prodotti");
        IO.println("3 - Eliminare un prodotto");
        IO.println("4 - Verificare se un prodotto è presente");
        IO.println("5 - Visualizzare il numero di prodotti presenti");
        IO.println("0 - Terminare il programma");

        String Scelta = IO.readln("Che cosa vuoi fare? ");
        IO.println("");
        switch (Scelta) {
            case "1" -> {
                boolean corretto = false;
                while (!corretto) {
                    String NuovoProdotto = IO.readln("Quale prodotto vuoi aggiungere? ");
                    if (Lista.contains(NuovoProdotto)) {
                        IO.println("Prodotto già presente nella lista");

                    } else if (!NuovoProdotto.isEmpty()) {
                        NuovoProdotto = NuovoProdotto.toLowerCase();
                        Lista.add(NuovoProdotto);
                        corretto = true;
                    } else {
                        IO.println("inserimento non valido");
                    }
                }
            }
            case "2" -> {
                for (int i = 0; i < Lista.size(); i++) {
                    IO.println((i + 1) + " -> " + Lista.get(i));
                }
            }

            case "3" -> {
                String ProdottoDaEliminare = IO.readln("Quale prodotto vuoi eliminare? ");
                ProdottoDaEliminare = ProdottoDaEliminare.toLowerCase();
                if (Lista.contains(ProdottoDaEliminare)) {
                    Lista.remove(ProdottoDaEliminare);
                    IO.println("Prodotto eliminato con successo");
                } else {
                    IO.println("Prodotto non presente in lista");
                }
            }
            case "4" -> {
                String ProdottoDaCercare = IO.readln("Quale prodotto vuoi cercare? ");
                ProdottoDaCercare = ProdottoDaCercare.toLowerCase();
                if (Lista.contains(ProdottoDaCercare)) {
                    IO.println("Il prodotto inserito è presente nella tua lista");
                } else {
                    IO.println("Prodotto non presente in lista");
                }
            }

            case "5" -> {
                int NumeroProdotti = Lista.size();
                IO.println("fino ad ora hai inserito " + NumeroProdotti + " prodotti in lista");
            }
            case "0" -> {
                IO.println("ok, bye bye");
                uscita = true;
            }
            case null, default -> {
                IO.println("scelta non valida");

            }

        }


    }


}
