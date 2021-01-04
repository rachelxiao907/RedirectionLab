import java.util.*;
public class MakeStars {
  public static void main(String[] args ){
    Scanner s = new Scanner(System.in);
    while (s.hasNextLine()) {
      Scanner line = new Scanner(s.nextLine());
      while (line.hasNext()) {
        for (int i = 0; i < line.next().length(); i++) {
          System.out.print("*");
        }
      }
      System.out.println();
    }

  }
}
