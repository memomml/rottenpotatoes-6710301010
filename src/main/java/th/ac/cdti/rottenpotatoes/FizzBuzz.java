package th.ac.cdti.rottenpotatoes;

/** Utility class that produces FizzBuzz strings for numbers. */
public final class FizzBuzz {
  private FizzBuzz() {}

  /**
   * Returns "FizzBuzz" if n is divisible by 15, "Fizz" if divisible by 3,
   * "Buzz" if divisible by 5, or the number itself as a string.
   */
  public static String of(int n) {
    if (n % 15 == 0) {
      return "FizzBuzz";
    }
    if (n % 3 == 0) {
      return "Fizz";
    }
    if (n % 5 == 0) {
      return "Buzz";
    }
    return Integer.toString(n);
  }
}
