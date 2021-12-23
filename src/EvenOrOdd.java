import java.util.Scanner;

public class EvenOrOdd {

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            Scanner console = new Scanner(System.in);
            double num = console.nextDouble();

            double a = (num / 2);
            System.out.println(a);
            int cel = (int) (num / 2);

            if ((a - cel) == 0) {
                System.out.println("Even");
            } else {
                System.out.println("Odd");
            }
        }
    }
}
