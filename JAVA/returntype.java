import java.util.Scanner;

public class returntype {
    public static void main(String[] args) {
        int ans = sum2();
        System.out.println(ans);
    }

    static int sum2() {
        Scanner input = new Scanner(System.in);
        System.out.println("enter num1 : ");
        int num1 = input.nextInt();
        System.out.println("enter num2 : ");
        int num2 = input.nextInt();

        int sum = num1 + num2;
        return sum;

    }

}
