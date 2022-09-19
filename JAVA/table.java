import java.util.Scanner;

public class table {
    public static void main(String[] args) {
        System.out.print("enter any num : ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(num + "*" + i + "=" + num * i);
        }
    }

}
