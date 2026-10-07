package lezione;

public class Main {
    public static void main(String[] args) {
        Matita matita = new Matita(10, "bic");


        IO.println(matita.caratteristicheMatita());

        matita.printCaratteristiche();

        matita.scrivi();

        matita.printCaratteristiche();

    }
}
