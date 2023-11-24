import java.util.Scanner;
import some.package.Palindrome; 
import some.package.OddOrEven;
import some.package.LCM;
import some.package.HCF;
public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Menu:");
            System.out.println("1. Check Palindrome");
            System.out.println("2. Check Odd or Even");
            System.out.println("3. Find LCM");
            System.out.println("4. Find HCF");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter a string: ");
                    String str = scanner.next();
                    if (Palindrome.isPalindrome(str))
                        System.out.println("It's a palindrome.");
                    else
                        System.out.println("It's not a palindrome.");
                    break;
                case 2:
                    System.out.print("Enter a number: ");
                    int num = scanner.nextInt();
                    String result = OddOrEven.checkOddOrEven(num);
                    System.out.println("Number is " + result);
                    break;
                case 3:
                    System.out.print("Enter first number: ");
                    int num1 = scanner.nextInt();
                    System.out.print("Enter second number: ");
                    int num2 = scanner.nextInt();
                    int lcm = LCM.findLCM(num1, num2);
                    System.out.println("LCM of " + num1 + " and " + num2 + " is " + lcm);
                    break;
                case 4:
                    System.out.print("Enter first number: ");
                    int hcfNum1 = scanner.nextInt();
                    System.out.print("Enter second number: ");
                    int hcfNum2 = scanner.nextInt();
                    int hcf = HCF.findHCF(hcfNum1, hcfNum2);
                    System.out.println("HCF of " + hcfNum1 + " and " + hcfNum2 + " is " + hcf);
                    break;
                case 5:
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        } while (choice != 5);

        scanner.close();
    }
}