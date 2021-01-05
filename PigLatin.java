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
    s = s.toLowerCase();
    if (s.charAt(0) == 'a' || s.charAt(0) == 'e' || s.charAt(0) == 'i' || s.charAt(0) == 'o' || s.charAt(0) == 'u') {
      return s + "hay";
    }
    return s.substring(1) + s.substring(0,1) + "ay";
  }

}
