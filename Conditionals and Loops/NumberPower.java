import java.util.Scanner;
public class NumberPower {  
  public static void main(String[] args) {
      // Write your code here
      Scanner s = new Scanner(System.in);
      int n = s.nextInt();
      int power = s.nextInt();
      int result = 1;
      for(int i=0;i<power;i++)
      {
        result=n*result;
      }
      System.out.println(result);
  }
}