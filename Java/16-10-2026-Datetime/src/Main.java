import java.time.LocalTime;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        LocalTime tempo = LocalTime.now();
        IO.println(tempo);



        LocalDate data = LocalDate.now();
        IO.println(data);
    }
}

