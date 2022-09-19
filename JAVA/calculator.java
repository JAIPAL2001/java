import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;
import javax.security.auth.x500.X500Principal;

public class calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ans = 0;
        while (true) {
            System.out.print("enter operator : ");
            char op = input.next().trim().charAt(0);
            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                System.out.println("enter two numbers : ");
                int num1 = input.nextInt();
                int num2 = input.nextInt();
                System.out.println();
                if (op == '+') {
                    ans = num1 + num2;
                }
                if (op == '-') {
                    ans = num1 - num2;
                }
                if (op == '/') {
                    ans = num1 / num2;
                }
                if (op == '%') {
                    ans = num1 % num2;
                }
                if (op == '*') {
                    ans = num1 * num2;

                }

            } else if (op == 'x' || op == 'X') {
                break;
            } else {
                System.out.println("invalid operation");

            }

            System.out.println(ans);
        }

    }

}
