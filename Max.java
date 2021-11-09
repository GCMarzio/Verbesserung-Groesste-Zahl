import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Max{

    /***
     * ljhliugiug
     * @param Marzio
     * @return
     */
    static int max(List<Integer> Marzio)  {
        // Entstehung des Variable Marzio.

        int max = Marzio.get(0);
        for (int i:Marzio) {
            if (max < i){
                max = i;
            }
        }

        return max;
    }
    public static void main(String[] args) {
        // Aufnehmen des Arrays.
        List<Integer> AusgabeZahlen = getNumbers();

        if (AusgabeZahlen.stream().count() >= 0) {
            int max = max(AusgabeZahlen);
            System.out.printf("Die höchste Zahl ist: %d%n", max);
            // Auwertungssatz
        }else {
            System.out.println("Keine Zahl eingegeben!");
        }
    }

    public static List<Integer> getNumbers() {
        List<Integer> numbers = new ArrayList<Integer>();
        for (int i = 0; i < 3; i++){
            numbers.add(getNumber());
        }

        return numbers;
    }

    public static int getNumber(){

        System.out.println("Bitte Nummer eingeben:");

        boolean throwsException = false;
        Scanner scanner = new Scanner(System.in);

        do {
            try {
                int number = Integer.parseInt(scanner.nextLine());
                return number;
            }catch (Exception e) {
                System.out.println("Falsche Eingabe!");
                throwsException = true;
            }
        } while (throwsException);

        return getNumber();
    }
}

