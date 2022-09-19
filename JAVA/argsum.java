import java.util.Scanner;

public class argsum {
    public static void main(String[] args) {
        // int ans = sum1(20, 30);
        // System.out.println(ans);
        Scanner input = new Scanner(System.in);
        System.out.print("enter name : ");
        String name = input.next();
        String personalized = myGreet(name);
        System.out.println(personalized);

    }

    static String myGreet(String name) {
        String message = "hello " + name;
        return message;

    }

    // static int sum1(int a, int b) {
    // int sum = a + b;
    // return sum;

}