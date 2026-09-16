void main() {
    String richiesta1 = IO.readln("Inserisci il primo numero ");
    String richiesta2 = IO.readln("Inserisci il secondo numero ");
    int num1 = Integer.parseInt(richiesta1);
    int num2 = Integer.parseInt(richiesta2);
    int f = 2;

    while (num1<num2) {

        while (f<num1){
            if (num1%f!=0){
                IO.println(num1);
            }

            f++;
        }

        num1++;
    }
}