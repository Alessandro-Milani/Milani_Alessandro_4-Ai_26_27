package lezione;

public class Matita {
    private int lunghezza;
    private String marca;

    Matita(int lunghezza, String marca) {
        this.lunghezza = lunghezza;
        this.marca = marca;
    }

    Matita(int lunghezza){
        this.lunghezza = lunghezza - 1;
    }

    String caratteristicheMatita() {
        return marca + " " + lunghezza;
    }

    void printCaratteristiche() {
        IO.println(marca + " " + lunghezza);
    }

    void scrivi() {
        this.lunghezza --;
    }
}
