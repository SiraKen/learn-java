/**
 * Javaの演習問題：構文編
 * 例外
 * https://eng-entrance.com/java-question-grammar#i-3
 * 
 * Null参照によるNullPointerException
 * 配列の範囲外参照によるArrayIndexOutOfBoundsException
 * 互換性の無いオブジェクト型の変換によるClassCastException
 */
package questions.grammar;

import java.util.Date;

public class Question2 {
  public static void main(String[] args) {
    NPE();
    AIOoBE();
    CCE();
  }

  /**
   * NullPointerException
   */
  private static void NPE() {
    String str = null;
    try {
      System.out.println(str.length());
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  /**
   * ArrayIndexOutOfBoundsException
   */
  private static void AIOoBE() {
    String strArray[] = { "ABC", "DEF", "GHI" };

    try {
      System.out.println(strArray[3]);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  /**
   * ClassCastException
   * TODO: この例外についてもう少し学習する
   */
  private static void CCE() {
    try {
      Object x = new Date(0);
      System.out.println((String)x);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
