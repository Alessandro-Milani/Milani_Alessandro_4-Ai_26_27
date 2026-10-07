package EsempiClassi;

public class Matita {

    private int Lunghezza;
    private String Marca;


    Matita(int lunghezza, String marca) { //*costruttore
        this.Lunghezza = lunghezza;
        this.Marca = marca;

    }

    Matita(int lunghezza) {
        this.Lunghezza = lunghezza;

    }

    String CaratteristicheMatita() {
        return Marca + " " + Lunghezza;
    }

    void PrintCaratteritiche() {
        IO.println(Marca + " " + Lunghezza);

    }

    void Scrivi() {
        this.Lunghezza--; //*va ad agire sull'oggetto su cui l'ho chiamato
    }

}
