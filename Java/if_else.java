import java.util.Scanner;
public class if_else {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input first number: ");
        int num1 = in.nextInt();
        System.out.print("Input second number: ");
        int num2 = in.nextInt();
        System.out.print("Input third number: ");
        int num3 = in.nextInt();
        System.out.print("Input fourth number: ");
        int num4 = in.nextInt();
        System.out.print("Enter fifth number: ");
        int num5 = in.nextInt();
        System.out.println("Average of five numbers is: " + (num1 + num2 + num3 + num4 + num5) / 5);
        double avg = (num1 + num2 + num3 + num4 + num5) / 5;
        if (avg>=90){
            System.out.println("you will get bicycle");
        }
        else if (avg>=70 && avg<90) {
            System.out.println("you will get chocolate");
        }
        else {
            System.out.println("study hard");
        }

    }
}
