import java.util.Scanner;

class luna{
    static int addition(int num1, int num2){
        System.out.print("Addition of given numbers = ");
        int z = num1 + num2;
        return (z);
    }
    static void subtraction(int num1, int num2){
        System.out.print("Subtraction of given numbers = ");
        if (num1>num2){
            System.out.println(num1 - num2);}
        else if (num2>num1){
            System.out.println(num2 - num1);
        }
    }
    static void multiplication(int num1, int num2){
        System.out.print("Multiplication of given no.s = ");
        System.out.println(num1 * num2);
    }
    static void division(int num1, int num2){
        System.out.print("Division of given no.s = ");
        System.out.println(num1 / num2);
    }
    static void modulus(int num1, int num2) {
        System.out.print("Modulus of given no.s = ");
        System.out.println(num1 % num2);
    }
    static void circlearea(int radius) {
        System.out.print("Area of the circle = ");
        System.out.println((float) Math.PI * radius * radius);
    }
}


public class Methods_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter num1: ");
        int x = in.nextInt();
        System.out.print("Enter num2: ");
        int y = in.nextInt();
        System.out.println(luna.addition(x,y));
        luna.subtraction(x,y);
        //luna.subtraction(x,y);
        luna.multiplication(x,y);
        luna.division(x,y);
        luna.modulus(x,y);
        System.out.print("Enter the Radius: ");
        int rad = in.nextInt();
        luna.circlearea(rad);


    }
}
