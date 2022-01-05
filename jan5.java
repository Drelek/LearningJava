public class jan5 {

  public static void main(String[] args) {
    // All of these should be the same
    System.out.println(max3(1, 2, 3));
    System.out.println(max3(3, 2, 1));
    System.out.println(max3(2, 1, 3));
    System.out.println(max3(1, 3, 2));
    System.out.println(max3(2, 3, 1));
    System.out.println(max3(3, 1, 2));

    System.out.println("-----------------------------");

    oneToN(10);

    System.out.println("-----------------------------");

    loanPayments(10000, 1000, 0.05);
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
      loan += loan * interest;  // Calculate interest before payment
      loan -= emi; // Make payment
      n++; // Keep track of payments
      System.out.println("Paying " + emi + " in installment " + n + ", principal left: " + loan);
    }
    System.out.println("Loan fully paid after " + n + " installments");
  }

}