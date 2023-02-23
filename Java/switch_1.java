import java.util.Scanner;

public class switch_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("day: ");
        int day = in.nextInt();
        System.out.println(
            switch (day) {
                case 1 -> "Monday";
                case 2 -> "Tuesday";
                case 3 -> "Wednesday";
                case 4 -> "Thursday";
                case 5 -> "Friday";
                case 6 -> "Saturday";
                case 7 -> "Sunday";
                default -> "Enter Valid Number";
            }
        );
    }
}
