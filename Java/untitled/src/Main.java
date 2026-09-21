
void main() {
    String richiesta1 = IO.readln("Inserisci il primo numero ");
    String richiesta2 = IO.readln("Inserisci il secondo numero ");
    int num1 = Integer.parseInt(richiesta1);
    int num2 = Integer.parseInt(richiesta2);

    while (num1<num2) {
        num1++;
        if (num1%3==0){
            IO.println(num1);
        }
    }
}
