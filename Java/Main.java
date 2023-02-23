public class Main {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int c = 0;
        int rangeStart = 50;
        int rangeEnd = 2600;

        while (true) {
            c = a + b;
            a = b;
            b = c;
            if (c >= rangeStart && c % 4 == 0) {
                System.out.println(c);
                break;
            }

        }
    }
}