import java.util.Scanner;
public class SumEvenOdd {
	
	public static void main(String[] args) {
		// Write your code here
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int evenSum=0,oddSum=0;    
    while(n>0)
    {
      int a= n%10;
      if(a%2==0)
      {
        evenSum+=a;
      }
      else
      {
        oddSum+=a;
      }
      n=n/10;

    }
	System.out.print(evenSum+" "+oddSum);
	}
}