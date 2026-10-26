package Esercizio_classi_calcio;

public class Calciatore {

    private String NomeDelCalciatore;
    private int NumeroDiMglia;
    Calciatore (String NomeDelCalciatore, int NumeroDiMaglietta){
        if (NomeDelCalciatore.isEmpty() || NumeroDiMaglietta<1 || NumeroDiMaglietta>99) {
            throw new IllegalArgumentException();
        }else{
            this.NomeDelCalciatore = NomeDelCalciatore;
            this.NumeroDiMglia = NumeroDiMaglietta;
        }
    }

}
