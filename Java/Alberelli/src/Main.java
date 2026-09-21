void main() {
    int a = 0;
    String dato = IO.readln("Inserisci grandezza base ");
    int base = Integer.parseInt(dato);
    int spazi = base;
    int altezza = 0;

    while(a<=base){

        int c = 0;
        while (c<spazi){
            IO.print(" ");
            c++;
        }

        c=0;
        while (c<=a){
        IO.print("X");
        c++;
        }

    IO.println(" ");
    a+=2;
    spazi--;
    altezza++;
    }
    int y = 0;
    while( y < altezza){
        int c=0;
        while (c<base){
            IO.print(" ");
            c++;
        }
        IO.println("X");
        y++;
    }
}
