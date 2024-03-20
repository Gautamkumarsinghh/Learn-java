import java.util.*;
//find a even and odd number
import java.util.Scanner;

public class conditional {
    // conditional Statements: if,else, else if, switch, break
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        if (x % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}
