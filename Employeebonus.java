import java.util.Scanner;



public class EmployeeBonus {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        

        System.out.print("Enter the current year: ");

        int currentYear = scanner.nextInt();

        

        System.out.print("Enter the year of joining: ");

        int joiningYear = scanner.nextInt();

        

        int yearsOfService = currentYear - joiningYear;

        

        if (yearsOfService > 5) {

            System.out.println("Bonus: Rs. 5000/-");

        } else if (yearsOfService >= 3 && yearsOfService <= 5) {

            System.out.println("Bonus: Rs. 3000/-");

        } else {

            System.out.println("No bonus awarded.");

        }

        

        scanner.close();

    }

}
