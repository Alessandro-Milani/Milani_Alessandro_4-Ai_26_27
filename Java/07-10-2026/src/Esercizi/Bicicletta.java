package Esercizi;

public class Bicicletta {
    private String marca;
    private int velocità;




    Bicicletta (String marca){
        this.marca = marca;
        this.velocità = 0;
    }
    void Stampa(){
        IO.println(marca+" "+velocità);
    }

    void accellera(){
        velocità+=5;
    }

    void frena(){
        velocità -=5;

    }
    void CambiaMarca(String NuovaMarca){
        this.marca = NuovaMarca;
    }


}
