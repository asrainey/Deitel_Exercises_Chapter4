// Exercise 4.11 - SmallestNumber4_11.java
// Write a program that finds the smallest of several integers.
// Assume that the first value read specifies the number
// of values to be input by the user.
import java.util.Scanner;

public class SmallestNumber4_11
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);

    int counter;
    int k = 1;
    int number;

    System.out.print("Please enter the number of values: ");
      counter = input.nextInt();

    System.out.print("Please enter a number: ");
      number = input.nextInt();

    int smallestNumber = number;

    while(k < counter)
    {
      if(number < smallestNumber)
        {
          smallestNumber = number;
        }

      k++;

      System.out.print("Please enter a number: ");
        number = input.nextInt();
    }

    System.out.printf("The smallest number is %d\n", smallestNumber);
  }
}
