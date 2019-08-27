import java.util.*;
public class Egypt {
	static void  egyptfraction(int n, int d)
	{
		if(n==0||d==0)
		{
			return;
		}
		if(d%n==0)
		{
			System.out.println("1/"+(d/n));
			return;
		}
		if(n>d)
		{
			System.out.print("1+");
			egyptfraction(n%d,d);
			return ;
		}
		int k = d/n+1; 
        System.out.print("1/"+k+"+"); 
        egyptfraction(n*k-d,d*k); 
  
	}
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("enter inputs");
		int numerator =s.nextInt();
		int denominator = s.nextInt();
		egyptfraction(numerator,denominator);
	}

}
