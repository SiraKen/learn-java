package src;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Calculator {

  /**
   * Main
   * @param args
   * @throws Exception
   */
  public static void main(String[] args) throws Exception {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String inputValue = br.readLine();
    String[] param = inputValue.split(" ");

    if (param.length < 2) {
      System.out.println("You gave less than 2 values. The program is quitting...");
      System.exit(0);
    }

    boolean isString = false;
    for (int i = 0; i < param.length; i++) {
      if (!param[i].matches("[+-]?\\d*(\\.\\d+)?")) {
        System.out.println(param[i] + " is not a number");
        isString = true;
        break;
      }
      System.out.println(param[i] + " is a number");
    }

    if (isString) {
      System.out.println("Given string value(s). The program is quitting...");
      System.exit(0);
    }
    
    System.out.println("-------------------------");
    for (int i = 0; i < param.length; i++) {
      System.out.println(param[i]);
    }
    System.out.println("-------------------------");

    if (param.length == 2) {
      int x = Integer.parseInt(param[0]);
      int y = Integer.parseInt(param[1]);
      System.out.println(Addition(x, y));
      System.out.println(Subtraction(x, y));
      System.out.println(Multiplication(x, y));
      System.out.println(Division(x, y));
      System.out.println(Average(x, y));
    }

  }

  /**
   * Calculate the addition of two given numbers
   * @param x
   * @param y
   * @return
   */
  private static int Addition(int x, int y) {
    return x + y;
  }

  /**
   * Calculate the subtraction from two given numbers
   * @param x
   * @param y
   * @return
   */
  private static int Subtraction(int x, int y) {
    return x - y;
  }

  /**
   * Calculate the multiplication of two given numbers
   * @param x
   * @param y
   * @return
   */
  private static int Multiplication(int x, int y) {
    return x * y;
  }

  /**
   * Calculate the division from two given numbers
   * @param x
   * @param y
   * @return
   */
  private static int Division(int x, int y) {
    return x / y;
  }

  /**
   * Calculate the average from two given numbers
   * @param x
   * @param y
   * @return
   */
  private static float Average(int x, int y) {
    return (x + y) / 2;
  }

}
