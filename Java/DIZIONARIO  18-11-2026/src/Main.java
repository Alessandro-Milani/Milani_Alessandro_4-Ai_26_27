import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        // Inizializzazione -> new HashMap<>(Map.of(":risata:", "😄"));
        HashMap<String, String> parolaToEmoji = new HashMap<>(Map.of("risata", "😄", "triste", "😢"));
        printHashMap(parolaToEmoji);
        // Aggiunta

        // Rimozione
        // Modifica
        // Get
        // Dimensione


        printHashMap(parolaToEmoji);
        // Modifica
        parolaToEmoji.put("felice", "😊");
        printHashMap(parolaToEmoji);
        // Get
        // Dimensione

        String Utente = IO.readln("Scrivi i tuoi feelings ");

        if (parolaToEmoji.containsKey(Utente)){
            IO.println(parolaToEmoji.get(Utente));

        }else{
            IO.println("emozione non trovez");

        }










    }


    private static void printHashMap(HashMap<String, String> parolaToEmoji) {
        for (String key : parolaToEmoji.keySet()) {
            IO.println(key + " - " + parolaToEmoji.get(key));
        }
        IO.println("--------------------");
    }


}
