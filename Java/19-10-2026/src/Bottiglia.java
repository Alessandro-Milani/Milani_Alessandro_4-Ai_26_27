public class Bottiglia {

    private boolean Stappata;
    private float Riempimento;
    private float MaxCapacità;

    Bottiglia (float maxCapacità){
        this.MaxCapacità = maxCapacità;
        this.Riempimento = maxCapacità;
        this.Stappata = false;
    }

    void StappaBottiglia (){
        if (!Stappata){
            Stappata = true;
        }
    }

    void BeviBottiglia(float QuantitàBevuta){
        if (Stappata && (QuantitàBevuta<Riempimento || QuantitàBevuta == Riempimento)){

            Riempimento=Riempimento-QuantitàBevuta;

        }else {
            throw new IllegalArgumentException();
        }

    }

    void RiempiBottiglia (){
        if (Stappata && Riempimento != MaxCapacità){
            Riempimento=MaxCapacità;

        }else {
            throw new IllegalArgumentException();
        }

    }

}
