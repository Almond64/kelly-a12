import java.util.Scanner;

public class Solution12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the principal: ");
        int principal = input.nextInt();
        System.out.println("Enter the rate of interest: ");
        double rate = input.nextDouble();
        System.out.println("Enter the number of years: ");
        int years = input.nextInt();
        //calculate the investment total
        double total = principal * (1 + (rate / 100)*years);
        System.out.printf("After %d years at %.2f, the investment will be worth $%.2f\n", years, rate, total);
    }
}
