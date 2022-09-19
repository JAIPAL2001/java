import java.util.Scanner;

public class switchcases {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String fruit = input.next();

        switch (fruit) {
            case "mango":
                System.out.println("king of fruits ");
                break;

            case "apple":
                System.out.println("sweet one ");
                break;

            default:
                System.out.println("enter valid fruit name ");

        }

    }

}
