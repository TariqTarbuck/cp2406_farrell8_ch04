// This class discounts prices by 10%
public class DebugFour4
{
   public static void main(String args[])
   {
      final double discountRate = 0.90;
      int price = 100;
      double priceTwo = 100.00;
      tenPercentOff(price, discountRate);
      tenPercentOff(priceTwo, discountRate);
   }
   public static void tenPercentOff(int price, final double discountRate)
   {
      double newPrice = (price * discountRate);
      System.out.println("Ten percent off"  + price);
      System.out.println("  New price is " + newPrice);
   }
   public static void tenPercentOff(double price,final double discountRate)
   {
      double newPrice = discountRate;
      System.out.println("Ten percent off " + price);
      System.out.println("  New price is " + newPrice);
   }
}
