import java.math.BigInteger;

public class EasyTasks {
  String text = "Madam, I'm Adam!";

  public BigInteger factorial(int value) {
    BigInteger bigInteger = BigInteger.valueOf(1);
    for (int i = 1; i <= value; i++) {
      bigInteger = bigInteger.multiply(BigInteger.valueOf(i));
    }
    return bigInteger;
  }

  public void isPalindrome(String text) {
    text = text.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
    String res = new StringBuilder(text).reverse().toString();
    System.out.println(res.equals(text));

  }

  public double sqrt(double number) {
    if (number < 0) {
      throw new IllegalArgumentException("Expected non-negative number, got " + number);
    }
    double resultSQRT = 0;
    double decrement = 0.001;
    while (true) {
      resultSQRT = resultSQRT + decrement;
      if ((number / (Math.round(resultSQRT * resultSQRT)) < 1)) {
        break;
      }
    }
    return Math.round(resultSQRT*1000)/1000.0d;
  }
}

