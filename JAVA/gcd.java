import java.util.Scanner;

public class gcd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int ans = 1;
        int min = (num1 > num2) ? num2 : num1;
        int lcd = 1;

        for (int i = 1; i <= num1; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                ans = i;
            }

        }
        System.out.println("gcd is : " + ans);
        for (int i = 1; i <= min; i++) {
            if (num1 % i == 0 && num2 % i == 0)
                lcd = i;

        }
        System.out.println("lcd is : " + lcd);
    }

}
