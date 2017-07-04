// Exercise 4.24: DiamondPrinting4_24.java
// Write an application that prints a diamond shape with asterisks
// Output statements can print a single asterisk, single space or single newline character
// 1, 3, 5, 7, 9, 7, 5, 3, 1

public class DiamondPrinting4_24
{
  public static void main(String[] args)
  {
    int space;
    int asterisk = 1;
	int line = 1;

    // number of spaces on either side of * is 5 - line number
    // number of asterisks, line 1 = 1, each subsequent line adds 2 to total

	while(line <= 5)
	{
		space = 5 - line;

		for(int counter = 1; counter <= space; counter++)
		{
			System.out.print(" ");
		}

		for(int counter = 1; counter <= asterisk; counter++)
		{
			System.out.print("*");
		}

		System.out.print("\n");
		asterisk +=2;
		line++;
	}

	// at this point line is 6 and asterisk is 11
	// need to adjust for bottom half of diamond

	line = 1;
	asterisk -= 2;

    // with line number reset, number of spaces on either side is same as line number

	while(line < 5)
	{
		space = line;
		asterisk -= 2;

		for(int counter = 1; counter <= space; counter++)
		{
			System.out.print(" ");
		}

		for(int counter = 1; counter <= asterisk; counter++)
		{
			System.out.print("*");
		}

		System.out.print("\n");
		line++;
	}
  }
}
