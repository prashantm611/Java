import java.util.ArrayList;


public class array {
    public static void main(String[] args) {
        ArrayList<Integer> array1 = new ArrayList<>();
        array1.add(1); array1.add(45); array1.add(56);array1.add(0,77);
        System.out.println(array1);
        System.out.println(array1.get(3));
        System.out.println(array1.size());
        System.out.println(array1.isEmpty());
        array1.remove(3);
        System.out.println(array1);
        ArrayList<String> array2 = new ArrayList<>();
        array2.add(0, "RJ"); array2.add("Aditya"); array2.add(2,"Lucifer"); array2.add(3,"Luna");
        array2.add(4,"Alicia");
        System.out.println(array2);
        System.out.println(array2.get(3));
        System.out.println(array2.size());
        System.out.println(array2.isEmpty());
        array2.remove(3);
        System.out.println(array2);
        System.out.println(array1);

    }
}
