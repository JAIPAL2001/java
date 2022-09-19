import java.util.Scanner;

public class changevalue {
    public static void main(String[] args) {
        // create an array
        int[] arr = { 1, 3, 4, 2, 5, 3, 3 };
        changearr(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void changearr(int[] nums) {
        nums[0] = 99;

    }

}
