import java.util.*;
public class PigLatin {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    while (in.hasNextLine()) {
      Scanner line = new Scanner(in.nextLine());
      while (line.hasNext()) {
        System.out.print(pigLatin(line.next()));
        System.out.print(" ");
      }
      System.out.println();
    }
    // Testing
    // System.out.println(pigLatin("a"));
    // System.out.println(pigLatin("check"));
    // System.out.println(pigLatin("skee"));
    // System.out.println(pigLatin("emu"));
    // System.out.println(pigLatin("grade"));
  }

  public static String pigLatinSimple(String s) {
    s = s.toLowerCase();
    if (s.charAt(0) == 'a' || s.charAt(0) == 'e' || s.charAt(0) == 'i' || s.charAt(0) == 'o' || s.charAt(0) == 'u') {
      return s + "hay";
    }
    return s.substring(1) + s.substring(0,1) + "ay";
  }

  public static String pigLatin(String s) {
    if (s.length() == 1) return pigLatinSimple(s);
    s = s.toLowerCase();
    String[] digraphs = {"bl", "br", "ch", "ck", "cl", "cr", "dr", "fl", "fr",
                          "gh", "gl", "gr", "ng", "ph", "pl", "pr", "qu", "sc",
                          "sh", "sk", "sl", "sm", "sn", "sp", "st", "sw", "th",
                          "tr", "tw", "wh", "wr"};
    for (int i = 0; i < digraphs.length; i++) {
      if (s.substring(0,2).equals(digraphs[i])) {
        i = digraphs.length;
        return s.substring(2) + s.substring(0,2) + "ay";
      }
    }
    return pigLatinSimple(s);
  }

}
