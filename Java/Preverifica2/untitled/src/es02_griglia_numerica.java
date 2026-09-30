import java.util.Random;

void main() {
    int i = 0;
    int Righe = 5;
    int Colonne = 6;
    int[][] Matrice = new int[Righe][Colonne];
    Random random = new Random();

    for (int l = 0; l < Righe; l++) {
        for (int j = 0; j < Colonne; j++) {
            Matrice[l][j] = 0;
            IO.print(Matrice[l][j] + " ");
        }
        IO.println("");
    }

    while (i < 12) {
        int RigaRandom = random.nextInt(1, Righe);
        int ColonnaRandom = random.nextInt(1, Colonne);
        if (Matrice[RigaRandom][ColonnaRandom] == 0) {
            int NumeroRandom = random.nextInt(1, 100);
            Matrice[RigaRandom][ColonnaRandom] = NumeroRandom;
            i++;
        }
    }
    IO.println("----------------------------");
    for (int l = 0; l < Righe; l++) {
        for (int j = 0; j < Colonne; j++) {
            IO.print(Matrice[l][j] + " ");
        }
        IO.println("");

    }
    boolean corretto = false;
    int RigaUtente = 0;
    int ColonnaUtente = 0;
    int NumeroUtente = 0;
    ArrayList<Integer> ValoriAccettatiRighe = new ArrayList<>(Arrays.asList(0, 1, 2, 3, 4));
    ArrayList<Integer> ValoriAccettatiColonne = new ArrayList<>(Arrays.asList(0, 1, 2, 3, 4, 5));


    while (!corretto) {
        boolean corretto2 = false;
        while (!corretto2) {
            RigaUtente = Integer.parseInt(IO.readln("Su che riga vuoi scrivere un numero?(1-5) "));
            ColonnaUtente = Integer.parseInt(IO.readln("Su che colonna vuoi scrivere un numero?(1-6) "));

            if (!ValoriAccettatiRighe.contains(RigaUtente - 1) || !ValoriAccettatiColonne.contains(ColonnaUtente - 1)) {
                IO.print("vaffancuculo");
            } else {
                corretto2 = true;
            }
        }
        corretto2=false;
        while(!corretto2){
            NumeroUtente = Integer.parseInt(IO.readln("Quale numero vuoi mettere? "));
            if (NumeroUtente<1 || NumeroUtente > 99){
                IO.print("vaffamboiler");
            }else {
                corretto2=true;
            }

        }
        if (Matrice[RigaUtente][ColonnaUtente]==0){
            Matrice[RigaUtente][ColonnaUtente]=NumeroUtente;
        }



    }


}