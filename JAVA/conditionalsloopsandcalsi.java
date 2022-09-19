import java.util.Scanner;

public class conditionalsloopsandcalsi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int salary = 25000;

        if (salary > 10000) {
            salary = salary + 2000;
        } else {
            salary = salary + 1000;
        }
        System.out.println(salary);

    }

}
