package es02_playlist;

import java.util.ArrayList;
import java.util.Arrays;

/*
 * Crea una playlist contenente cinque titoli di canzoni.
 * Stampa ogni titolo insieme alla sua posizione nella lista.
 * Rimuovi una canzone conoscendo il suo indice.
 * Rimuovi poi un'altra canzone conoscendone il titolo.
 * Stampa la prima e l'ultima canzone rimaste.
 * Svuota la playlist e verifica che sia effettivamente vuota.
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<String> Playlist = new ArrayList<>(Arrays.asList("Shoot to thrill", "Gold", "Bring me to life", "A man without love", "The pretender"));
        int i=0;
        while(i<Playlist.size()){
            IO.println((i+1) + " --> " + Playlist.get(i));
            i++;
        }
        IO.print("\n");
        Playlist.remove(4);
        IO.println(Playlist);
        Playlist.remove("Shoot to thrill");
        IO.println(Playlist);

        IO.println("Prima canzone --> " + Playlist.get(0));
        IO.println("Ultima canzone --> " + Playlist.get(Playlist.size()-1));

        Playlist.clear();

        IO.println(Playlist);



    }
}
