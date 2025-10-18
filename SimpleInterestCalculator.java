package ITPR_lab_work;
import java.util.Scanner;
class SI{
    
}

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

        // Calling the method to calculate SI
        double simpleInterest = calculateSimpleInterest(principal, rate, time);

        // Displaying the result
        System.out.println("Simple Interest = " + simpleInterest);

        sc.close();
    }
}


