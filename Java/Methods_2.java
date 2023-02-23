import java.util.Scanner;
class lucy{
    static int addition(int num1, int num2) {
        System.out.print("Addition of two numbers = ");
        int z = num1 + num2;
        return (z);
    }
    static int addition(int num1, int num2, int num3){
        System.out.print("Addition of three numbers = ");
        int z = num1 + num2 + num3;
        return (z);
    }
    static int addition(int num1, int num2, int num3, int num4){
        System.out.print("Addition of four numbers = ");
        int z = num1 + num2 + num3 + num4;
        return (z);
    }
    static int addition(int num1, int num2, int num3, int num4, int num5) {
        System.out.print("Addition of five numbers = ");
        int z = num1 + num2 + num3 + num4 + num5;
        return (z);
    }
}
public class Methods_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter num1: ");
        int a = in.nextInt();
        System.out.print("Enter num2: ");
        int b = in.nextInt();
        System.out.print("Enter num3: ");
        int c = in.nextInt();
        System.out.print("Enter num4: ");
        int d = in.nextInt();
        System.out.print("Enter num5: ");
        int e = in.nextInt();
        System.out.println(lucy.addition(a,b));
        System.out.println(lucy.addition(a,b,c));
        System.out.println(lucy.addition(a,b,c,d));
        System.out.println(lucy.addition(a,b,c,d,e));
        int gg =22;



    }
}
