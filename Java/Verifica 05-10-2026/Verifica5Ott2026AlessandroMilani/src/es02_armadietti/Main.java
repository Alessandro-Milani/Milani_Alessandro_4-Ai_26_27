package es02_armadietti;

import java.util.Random;


public class Main {
    public static void main(String[] args) {

        boolean SpazioVuoto = true;
        boolean MagazzinoPieno = false;
        int RigaUtente = 0;
        int ColonnaUtente = 0;
        boolean Corretto = false;
        int NumeroCicli = 0;
        Random random = new Random();
        int NumeroRighe = 5;
        int NumeroColonne = 6;
        int[][] Magazzino = new int[NumeroRighe][NumeroColonne];

        for (int i = 0; i < NumeroRighe; i++) {
            for (int j = 0; j < NumeroColonne; j++) {
                IO.print(Magazzino[i][j] + " ");

            }
            IO.println("");
        }
        IO.println("-------------------------");


        while (NumeroCicli < 12) {
            int NumeroRigaRandom = random.nextInt(0, NumeroRighe);
            int NumeroColonnaRandom = random.nextInt(0, NumeroColonne);
            int NumeroRandom = random.nextInt(1, 100);
            if (Magazzino[NumeroRigaRandom][NumeroColonnaRandom] == 0) {
                Magazzino[NumeroRigaRandom][NumeroColonnaRandom] = NumeroRandom;
                NumeroCicli = NumeroCicli + 1;

            }


        }
        while (!MagazzinoPieno) {

            for (int f = 0; f < NumeroRighe; f++) {
                for (int x = 0; x < NumeroColonne; x++) {
                    IO.print(Magazzino[f][x] + " ");

                }
                IO.println("");

            }
            Corretto = false;
            while (!Corretto) {
                RigaUtente = Integer.parseInt(IO.readln("Dimmi la riga su cui vuoi inserire il tuo pacco "));
                RigaUtente = RigaUtente - 1;
                if (RigaUtente < 0 || RigaUtente > NumeroRighe) {
                    IO.println("Indice non valido, riprovare");
                } else {
                    ColonnaUtente = Integer.parseInt(IO.readln("Dimmi la Colonna su cui vuoi inserire il tuo pacco "));
                    ColonnaUtente = ColonnaUtente - 1;
                    if (ColonnaUtente < 0 || ColonnaUtente > NumeroColonne) {
                        IO.println("Indice non valido, riprovare");
                    } else {
                        Corretto = true;
                    }
                }


            }
            Corretto = false;
            if (Magazzino[RigaUtente][ColonnaUtente] == 0) {

                while (!Corretto) {
                    int NumeroUtente = Integer.parseInt(IO.readln("Quale numero vuoi inserire (1-99) "));
                    if (NumeroUtente > 1 && NumeroUtente < 100) {
                        Magazzino[RigaUtente][ColonnaUtente] = NumeroUtente;
                        Corretto = true;
                    }
                }
            } else {
                IO.println("La posizione che hai indicato è già occupata");
            }

            SpazioVuoto = false;
            for (int i = 0; i < NumeroRighe; i++) {
                for (int j = 0; j < NumeroColonne; j++) {
                    if (Magazzino[i][j] == 0) {
                        SpazioVuoto = true;
                    }
                }
            }

            if (!SpazioVuoto) {
                MagazzinoPieno = true;
            }


        }
        for (int f = 0; f < NumeroRighe; f++) {
            for (int x = 0; x < NumeroColonne; x++) {
                IO.print(Magazzino[f][x] + " ");

            }
            IO.println("");
        }
        IO.println("Il magazzino è pieno !");


    }
}
