// Exercise 4.29: TwelveDays4_29.java
// Use repetition and switch statements to print the song
// Twelve Days of Christmas

public class TwelveDays4_29
{
  public static void main(String args[])
  {
    int day = 1;

    while(day <= 12)
    {
      switch (day)
      {
        case 1:
          System.out.println("On the First day of Christmas my true love sent to me");
        break;

        case 2:
          System.out.println("On the Second day of Christmas my true love sent to me");
        break;

        case 3:
          System.out.println("On the Third day of Christmas my true love sent to me");
        break;

        case 4:
          System.out.println("On the Fourth day of Christmas my true love sent to me");
        break;

        case 5:
          System.out.println("On the Fifth day of Christmas my true love sent to me");
        break;

        case 6:
          System.out.println("On the Sixth day of Christmas my true love sent to me");
        break;

        case 7:
          System.out.println("On the Seventh day of Christmas my true love sent to me");
        break;

        case 8:
          System.out.println("On the Eighth day of Christmas my true love sent to me");
        break;

        case 9:
          System.out.println("On the Ninth day of Christmas my true love sent to me");
        break;

        case 10:
          System.out.println("On the Tenth day of Christmas my true love sent to me");
        break;

        case 11:
          System.out.println("On the Eleventh day of Christmas my true love sent to me");
        break;

        case 12:
          System.out.println("On the Twelfth day of Christmas my true love sent to me");
        break;
      }



      switch (day)
      {
        case 12:
          System.out.println("Twelve Drummers Drumming,");

        case 11:
          System.out.println("Eleven Pipers Piping,");

        case 10:
          System.out.println("Ten Lords a-Leaping,");

        case 9:
          System.out.println("Nine Ladies Dancing,");

        case 8:
          System.out.println("Eight Maids a-Milking,");

        case 7:
          System.out.println("Seven Swans a-Swimming,");

        case 6:
          System.out.println("Six Geese a-Laying,");

        case 5:
          System.out.println("Five Gold Rings,");

        case 4:
          System.out.println("Four Calling Birds,");

        case 3:
          System.out.println("Three French Hens");

        case 2:
          System.out.printf("Two Turtle Doves,\nand ");

        default:
          System.out.println("A Partridge in a Pear Tree");
    }
    day++;
    }
  }
}
