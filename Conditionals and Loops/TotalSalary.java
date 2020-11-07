import java.util.Scanner;
import java.lang.Math;
public class TotalSalary {
	
	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int basic = s.nextInt();
        char c = s.next().charAt(0);
        double hra = 20;
        double da = 50;
        double pf = 11;
        double allow;
        hra = (double)basic/100*20;
        da = (double)basic/100*50;
        pf = (double)basic/100*11;    
        double totalSalary = totalSalary = basic+hra+da-pf;
        if(c == 'A')
        {
            allow = 1700;
            totalSalary += allow; 
            System.out.println(Math.round(totalSalary));
            
            
        }
        else if(c == 'B')
        {
            allow = 1500;
            totalSalary += allow; 
            System.out.println(Math.round(totalSalary));
        }
        else
        {
            allow = 1300;
            totalSalary += allow; 
            System.out.println(Math.round(totalSalary));
            
        }
    	


	}
}
