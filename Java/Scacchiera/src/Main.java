
void main() {

    String misura = IO.readln("dimensione della scacchiera ");
    int mis = Integer.parseInt(misura);


    for (int i = 0; i < mis; i++) {
        for(int n = 0; n < mis; n++){
            if(i%2==0){
                if(n%2==0){
                    IO.print("X");
                }
                else{
                    IO.print("-");
                }
            }
            else {
                if(n%2==1){
                    IO.print("X");
                }
                else{
                    IO.print("-");
                }
            }


        }

    IO.println("");
    }
}
