import java.util.*;
public class MakeStars {
  public static void main(String[] args ) {
    Scanner s = new Scanner(System.in);
    while (s.hasNextLine()) {
      Scanner line = new Scanner(s.nextLine());
      while (line.hasNext()) {
        int length = line.next().length();
        for (int i = 0; i < length; i++) {
          System.out.print("*");
        }
        if (line.hasNext()) System.out.print(" ");
      }
      System.out.println();
    }
  }
}
