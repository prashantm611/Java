import java.util.Scanner;
class cal3 extends cal2{
    public int cal_div(int x, int y) {
        return x/y;
    }
}
class cal2 extends cal1{
    public int cal_mul(int x, int y) {
        return x*y;
    }
}
class cal1 extends cal{     // parent class
    public int cal_sub(int x,int y){
        return x-y;
    }
}
class cal {     // child
    public int cal_add(int x, int y) {
        return x + y;
    }
    public boolean cal_bool(int x, int y) {
        return x > y;
    }
}

public class inheritance {
    public static void main(String[] args) {
        cal3 c=new cal3();
        Scanner in = new Scanner(System.in);
        System.out.print("Enter num1: ");
        int a = in.nextInt();
        System.out.print("Enter num2: ");
        int b = in.nextInt();
        int s = c.cal_add(a,b);
        int h= c.cal_div(a,b);
        int u = c.cal_mul(a,b);
        int p = c.cal_sub(a,b);
        boolean t = c.cal_bool(a,b);
        System.out.println("addition: " + s);
        System.out.println("subtraction: " + p);
        System.out.println("multiplication: " + u);
        System.out.println("division: " + h);
        System.out.println("Num1 > Num2: " + t);
    }
}



