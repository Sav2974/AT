public class CountingSheep {

    public static void main (String[] args) {
        Boolean[] arr = new Boolean[] {
                true, true, true, false,
                true, true, true, true,
                true, false, true, false,
                true, false, false, true,
                true, true, true, true,
                false, false, true, true};
        int a=0;
        for (int i=0; i<arr.length; i++){
            if (arr[i] == true) {
                a = a + 1;
            }
        }
        System.out.println(a);

    }
}

