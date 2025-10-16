import java.util.Scanner;

public class SimpleInterestCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter Principal amount: ");
        double principal = sc.nextDouble();

        System.out.print("Enter Rate of interest: ");
        double rate = sc.nextDouble();

        System.out.print("Enter Time (in years): ");
        double time = sc.nextDouble();

        // Calculating Simple Interest
        double simpleInterest = (principal * rate * time) / 100;

        // Displaying the result
        System.out.println("Simple Interest = " + simpleInterest);

        sc.close();
    }
}

