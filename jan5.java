import java.util.Scanner;

public class jan5 {

  public static Scanner ki;

  public static void main(String[] args) {
    ki = new Scanner(System.in);

    // Get user input
    System.out.println("Please enter three numbers:");
    double a = ki.nextDouble();
    double b = ki.nextDouble();
    double c = ki.nextDouble();

    System.out.println("The max is " + max3(a, b, c));

    System.out.println("-----------------------------");

    System.out.println("Enter a number:");
    int n = ki.nextInt();
    oneToN(n);

    System.out.println("-----------------------------");

    System.out
        .println("Enter a loan principal amount, the monthly payment amount, and the interest rate as a decimal:");
    int loan = ki.nextInt();
    int emi = ki.nextInt();
    double interestRate = ki.nextDouble();
    loanPayments(loan, emi, interestRate);
  }

  public static double max3(double a, double b, double c) {
    if (a > b) { // Check a
      if (a > c)
        return a;
      else
        return c;
    } else if (b > c) // Check b
      return b;
    else
      return c; // If neither a nor b, must be c
  }

  public static void oneToN(int n) {
    for (int i = 1; i <= n; i++) { // Iterate from 1 to n
      System.out.println(i + " " + (i % 2 == 0 ? "Even" : "Odd")); // Use ternary for even/odd
    }
  }

  public static void loanPayments(int loan, int emi, double interest) {
    int n = 0;
    while (loan > 0) {
      loan += loan * interest; // Calculate interest before payment
      loan -= emi; // Make payment
      n++; // Keep track of pa ents
      System.out.println("Paying " + emi + " in installment " + n + ", principal left: " + loan);
    }
    System.out.println("Loan fully paid after " + n + " installments");
  }

}

class Calculator {
  int num1;
  int num2;

  public int add() {
    int sum = num1 + num2;
    return sum;
  }
}