import java.util.*;

import java.util.Scanner;

public class conditional {
    // conditional Statements: if,else, else if, switch, break
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if (age > 18) {
            System.out.println("Adult");
        } else {
            System.out.println("Not Adult");
        }
    }
}
    
