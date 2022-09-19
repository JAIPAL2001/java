import java.util.Scanner;

public class functions {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2, sum;

        System.out.println("enter num1 : ");
        num1 = input.nextInt();
        System.out.println("enter num2 : ");
        num2 = input.nextInt();
        sum = num1 + num2;
        System.out.println("sum is : " + sum);

    }

}
