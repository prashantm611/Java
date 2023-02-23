import java.util.Scanner;

public class for_loop
{
    public static void main(String[] args)
    {
        //for (int i = 1; i < 5; i = i+2) {System.out.println(i);}

        int c = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string :");
        String str = sc.nextLine();
        char[] a = str.toCharArray();
        for (char ch : a)  //for enhanced loop
        {
            c++;
        }
        System.out.println("string contains " + c + " characters");

        str = str.toLowerCase();
        int count = 0;
        for (int i = 0; i < str.length(); i++)
        {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u')
            {
                count++;
            }
        }System.out.println("the no. of vowels in the string are:" + count);
    }
}
