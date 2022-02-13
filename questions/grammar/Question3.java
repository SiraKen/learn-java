/**
 * Javaの演習問題：構文編
 * static、ジェネリクス、アノテーション
 * https://eng-entrance.com/java-question-grammar#i-4
 */
package questions.grammar;

import java.util.ArrayList;
import java.util.List;

public class Question3 {
  public static void main(String[] args) {
    // TODO: wip
    List list = new ArrayList<String>();
    list.add(args.clone());
    System.out.println(list);
  }
}
