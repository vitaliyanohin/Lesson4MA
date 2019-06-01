import java.math.BigInteger;

public class EasyTasks {
  private String text = "Madam, I'm Adam!";

  public BigInteger factorial(int value) {
    BigInteger bigInteger = BigInteger.valueOf(1);
    for (int i = 1; i <= value; i++) {
      bigInteger = bigInteger.multiply(BigInteger.valueOf(i));
    }
    return bigInteger;
  }

  public static boolean isPalindrome(String text) {
    text = text.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
    String res = new StringBuilder(text).reverse().toString();
    return res.equals(text);
  }

  public double sqrt(double number) {
    if (number < 0) {
      throw new IllegalArgumentException("Expected non-negative number, got " + number);
    }
    return Math.sqrt(number);
  }
}
