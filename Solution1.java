public class Solution1 {

  public static void main(String[] args) {
    /** Write an if statement that adds 1 to x if x is positive, and subtracts 1 from x if x is negative,
     * but leaves x alone if x is 0. Assume x is a predefined and initialized integer. */

    int x = 6;

    if (x > 0) {
      x += 1;
    } else if (x < 0) {
      x -= 1;
    } else {
      return;
    }
  }
}
