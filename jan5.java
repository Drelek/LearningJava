public class jan5 {

  public static void main(String[] args) {
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
    if (a > b) {
      if (a > c)
        return a;
      else
        return c;
    } else if (b > c)
      return b;
    else
      return c;
  }

  public static void oneToN(int n) {
    for (int i = 1; i <= n; i++) {
      System.out.println(i + " " + (i % 2 == 0 ? "Even" : "Odd"));
    }
  }

  public static void loanPayments(int loan, int emi, double interest) {
    int n = 0;
    while (loan > 0) {
      loan += loan * interest;
      loan -= emi;
      n++;
      System.out.println("Paying " + emi + " in installment " + n + ", principal left: " + loan);
    }
    System.out.println("Loan fully paid after " + n + " installments");
  }

}