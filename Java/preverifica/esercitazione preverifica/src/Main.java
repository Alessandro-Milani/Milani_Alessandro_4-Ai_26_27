
void main(){

    ArrayList<Integer> Codici = new ArrayList<>();
    boolean fine = false;
    while (!fine) {
        IO.println(" ");
        IO.println("----MENU----");
        IO.print("\n");
        IO.println("1 - Inserisci un nuovo codice");
        IO.println("2 - Visulizza codici inseriti");
        IO.println("3 - Elimina un codice");
        IO.println("4 - Controllare se un codice è presente in archivio");
        IO.println("0 - Esci");

        String Scelta = IO.readln("che cosa scegli? ");

        switch (Scelta) {
            case "1" -> {
                boolean Corretto = false;
                while (!Corretto) {
                    String NuovoCodice = IO.readln("Inserisci un nuovo codice (1000-9999) ");
                    int CodiceInt = Integer.parseInt(NuovoCodice);
                    if (CodiceInt > 999 && CodiceInt < 10000) {
                        Codici.add(CodiceInt);
                        Corretto = true;
                    } else {
                        IO.println("codice out of bounds, riprova");
                    }

                }
            }
            case "2" -> {
                if (Codici.isEmpty()) {
                    IO.println("Non è stato inserito ancora nessun codice");
                } else {
                    for (int i = 0; i < Codici.size(); i++) {
                        IO.println((i+1) + "-->" + Codici.get(i));

                    }
                }
            }
            case "3" -> {
                boolean GiustoOccorrenze = false;
                while(!GiustoOccorrenze) {
                    String CodiceDaEliminareS = IO.readln("Quale codice vuoi rimuovere? ");
                    int CodiceDaEliminareI = Integer.parseInt(CodiceDaEliminareS);
                    if (Codici.contains(CodiceDaEliminareI)){
                    String SceltaOccorrenze = IO.readln("Vuoi rimuoverne tutte le occorrenze? (s/n) ");
                    switch (SceltaOccorrenze) {
                        case "n" -> {
                            Codici.remove(CodiceDaEliminareI);
                            IO.println("codice rimosso con successo");
                            GiustoOccorrenze=true;
                        }
                        case "s" -> {
                            for (int j = 0; j < Codici.size(); j++) {
                                if (Codici.get(j)==CodiceDaEliminareI){
                                    Codici.remove(j);
                                }
                            }
                        }
                        case null, default -> IO.println("Risposta non valida");

                    }
                    }else {
                        IO.println("codice non presente in archivio");
                    }
                }
            }
            case "4" -> {
                String CodiceDaCercareS = IO.readln("Quale codice vuoi cercare? ");
                int CodiceDaCercareI = Integer.parseInt(CodiceDaCercareS);
                if (Codici.contains(CodiceDaCercareI)){
                    IO.println("Questo codice è presente in archivio");
                }
            }
            case "0" -> {
                IO.println("bye bye");
            }
            case null, default -> IO.println("Indice inserito non valido");
        }
    }

}