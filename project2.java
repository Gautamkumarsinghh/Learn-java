import java.util.*;
//How to find a greater, lesser, Equal
public class conditional {
    public static void main(String arge[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a == b) {
            System.out.println("Equal");
        } else {
            if (a > b) {
                System.out.println("a is greater");

            } else {
                System.out.println("a is lesser");
            }
        }
    }
}
