import java.util.Scanner;

public class palindromo {
  public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    String word = sc.nextLine();
    compareWord(word);
    sc.close();
  }
  private static void compareWord(String w) {
    w = w.replace(" ", "");
    w = w.toLowerCase();
    StringBuilder newWord = new StringBuilder(w);
    String reverseWord = newWord.reverse().toString();
    if (w.equalsIgnoreCase(reverseWord)){
      System.out.println("Es palindromo");
    }else {
      System.out.println("No es palindromo");
    }
  }
}
