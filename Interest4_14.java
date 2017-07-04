// Exercise 4.14 Interest4_14.java
// Compound interest calculations with for.
// repeat steps for 5%, 6%, 7%, 8%, 9% and 10%

public class Interest4_14
{
  public static void main(String[] args)
  {
    double amount;
    double principal = 1000.0;  // initial amount before interest
    double rate;         // interest rate

    for (rate = 0.05; rate <= 0.10; rate += 0.01)
    {
      System.out.printf("Interest rate = %.2f%n", rate);
      System.out.printf("%s%20s%n", "Year", "Amount on deposit");

      for(int year = 1; year <= 10; ++year)
      {
        // calculate new amount for specified year
        amount = principal * Math.pow(1.0 + rate, year);

        // display the year and the amount
        System.out.printf("%4d%,20.2f%n", year, amount);
      }
    }
  }
}
