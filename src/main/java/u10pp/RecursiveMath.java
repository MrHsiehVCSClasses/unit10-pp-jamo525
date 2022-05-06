package u10pp;
import java.math.BigInteger;

public class RecursiveMath
{
  /*
  @precondition exponent is >= 0
  @param base double, and exponent intiger
  @return base to the power of the exponent
  */
  public static double pow(double base, int exponent)
  {
    if (exponent == 0)
      return 1;
    return base * pow(base, exponent - 1);
  }

  /*
  @precondition n is >= 0
  @param integer
  @return factorial of integer
  */
  public static BigInteger getFactorial(int n)
  {
    if (n == 1 || n == 0)
      return BigInteger.valueOf(1);
    return getFactorial(n - 1).multiply(BigInteger.valueOf(n));
  }

  /*
  @precondition n is >= 0
  @param integer
  @return the fibonnaci number that corrolates with the given integer
  */
  public static int getFibonacciNumber(int n)
  {
    if (n==0)
      return 0;
    if (n==1)
      return 1;
    return getFibonacciNumber(n - 1) + getFibonacciNumber(n - 2);
  }
}
