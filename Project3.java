import java.util.*;
//if-else if
public class conditional {
    public static void main(String arge[]) {
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();
//if else- if use code
        if (button == 1) {
            System.out.println("Hello");
        } else if (button == 2) {
            System.out.println("Namaste");
        } else if (button == 3) {
            System.out.println("Welcome");
        } else {
            System.out.println("Invalid Button");
        }

  //Switch case statement use code

   switch (button) {
            case 1:
                System.out.println("Hello");
                break;
            case 2:
                System.out.println("Namaste");
                break;
            case 3:
                System.out.println("Welcome");
                break;

            default:
                System.out.println("Invalid Button");
     
    }

}
