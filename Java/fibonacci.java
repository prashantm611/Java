import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the lower bound: ");
        int lower = sc.nextInt();
        System.out.print("Enter the upper bound: ");
        int upper = sc.nextInt();

        int a = 0, b = 1, c = 0, result = 0;
        while (c < upper) {
            c = a + b;
            a = b;
            b = c;
            if (c >= lower && c % 4 == 0) {
                result = c;
                break;
            }
        }
        if (result == 0) {
            System.out.println("0");
        } else {
            System.out.println(result);
        }
    }
}