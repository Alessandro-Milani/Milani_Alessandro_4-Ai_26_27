package Esercizi;

public class Main {
    public static void main(String[] args) {
        Bicicletta bici = new Bicicletta("Graziella");
        bici.accellera();
        bici.Stampa();
        bici.frena();
        bici.Stampa();
        bici.CambiaMarca("mountain bike");
        bici.Stampa();


    }


}
