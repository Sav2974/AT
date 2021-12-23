import java.util.Scanner;

public class Summation {

    public static void main(String[] args) {


            Scanner console = new Scanner(System.in);
            int num = console.nextInt();
            int sum=0;
            for (int i = 0; i < num; i++) {
                sum = sum + (i+1);
            //    System.out.println(sum);
            }
            System.out.println(sum);

    }
}
