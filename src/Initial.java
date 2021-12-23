import java.util.Locale;
import java.util.Scanner;

public class Initial {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String names = console.nextLine();

        String[] init = names.split(" ");

            String[] slovo1 = init[0].split("");
            String[] slovo2 = init[1].split("");

            System.out.print(slovo1[0].toUpperCase()+"."+slovo2[0].toUpperCase());

        System.out.println();
    }
}
