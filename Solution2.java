import java.util.*;

public class Solution2 {

  public static void main(String[] args) {
    /** Write a Java program that accepts two integer values from keyboard and prints their average. */
    System.out.print("Enter 2 integers: ");
    Scanner input = new Scanner(System.in);
    int int1 = input.nextInt();
    int int2 = input.nextInt();
    input.close();

    double average = (double) (int1 + int2) / 2;
    System.out.printf("The average of %d and %d is %.2f", int1, int2, average);
  }
}
