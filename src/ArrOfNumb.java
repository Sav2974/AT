import java.util.Scanner;

public class ArrOfNumb {

    public static void main (String[] args) {
        Scanner console = new Scanner(System.in);
        String stroka = console.nextLine();

        String[] chislo = stroka.split(", ");
        int count = stroka.split(", ").length;

        double sum1 = 0;
        double sum2 = 0;
        for (int i=0; i<count; i++) {

            double a = Integer.parseInt(chislo[i]);

            if (a%2 == 0) {
               sum1 = sum1+a;
            }
            else {
                sum2 = sum2 + a;
            }

        }
        if (sum1>sum2) {
            System.out.println((int) sum2);
        }
        else {
            System.out.println((int) sum1);
        }
    }
}
