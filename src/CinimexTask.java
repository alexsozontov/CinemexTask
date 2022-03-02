import java.util.stream.IntStream;

public class CinimexTask {

  public String checkPalindromeString(String s) {
    String reverse = new StringBuffer(s).reverse().toString();
    if (s.equals(reverse)) {
      return "YES";
    } else {
      return "NO";
    }
  }

  public int getFactorialNum(int n) {
    if (n <= 1) {
      return 1;
    } else {
      //Сделал стримами т.к изучаю сейчас StreamAPI;
      return IntStream.rangeClosed(2, n).reduce((a, b) -> a * b).getAsInt();
    }
  }
}
