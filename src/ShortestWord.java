import java.util.Scanner;

public class ShortestWord {

    public static void main (String[] args) {
        Scanner console = new Scanner(System.in);
        String stroka = console.nextLine();

        String[] slovo = stroka.split(" ");
        int count = stroka.split(" ").length;
        String slovoKor = slovo[0];

            for (int i = 0; i<count; i++) {
                if (slovo[i].length()<slovoKor.length()) {
                    slovoKor = slovo[i];
                }
            }

        System.out.println(slovoKor);

    }
}
