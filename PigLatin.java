import java.util.*;
public class PigLatin {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    while (in.hasNextLine()) {
      Scanner line = new Scanner(in.nextLine());
      while (line.hasNext()) {
        System.out.print(pigLatinSimple(line.next()));
        System.out.print(" ");
      }
      System.out.println();
    }
  }

  public static String pigLatinSimple(String s) {
    String t = s.toLowerCase();
    if (t.charAt(0) == 'a' || t.charAt(0) == 'e' || t.charAt(0) == 'i' || t.charAt(0) == 'o' || t.charAt(0) == 'u') {
      return s + "hay";
    }
    return s.substring(1) + s.substring(0,1) + "ay";
  }

}
