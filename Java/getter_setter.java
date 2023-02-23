import java.util.Scanner;
class alice{
    int radius;
    public void set(int num1) {

        this.radius = num1;
    }
    public int get_Radius(){

        return radius;
    }
    public float get_circle_area(){

        return (float) (Math.PI*radius*radius);
    }
}
public class getter_setter {
    public static void main(String[] args) {
        alice al = new alice();
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Radius: ");
        int radius = in.nextInt();
        al.set(radius);
        System.out.println("Radius of the circle: " + al.get_Radius());
        System.out.println("Area of the Circle: " + al.get_circle_area());
    }
}
