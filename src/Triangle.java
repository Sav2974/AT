import java.util.Scanner;

public class Triangle {

    public static void main (String[] args) {
        Scanner console = new Scanner(System.in);
        String a = console.nextLine();
        String b = console.nextLine();
        String c = console.nextLine();

        if (((Integer.parseInt(a)+Integer.parseInt(b))<Integer.parseInt(c)) | ((Integer.parseInt(a)+Integer.parseInt(c))<Integer.parseInt(b)) | ((Integer.parseInt(b)+Integer.parseInt(c))<Integer.parseInt(a))) {
            System.out.println("false");
        }
        else {
            System.out.println("true");
        }
    }
}