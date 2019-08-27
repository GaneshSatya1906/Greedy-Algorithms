import java.util.*;
class P
{ 
	int st;
	int et;
	P(){}
	P(int s, int e)
	{
		st=s;
		et=e;
	}
}
class sortbye implements Comparator<P>{
	public int compare(P p1, P p2)
	{
		if(p1.et > p2.et) return -1;
		else if(p1.et <p2.et) return 1;
		else return 0;
	}
}
public class Js 
{
    public static void main(String args[])
   {
	Scanner s = new Scanner(System.in);
	System.out.println("Enter no of jobs to be scheduled");
	int n = s.nextInt();
	int a[] = new int[n];
	System.out.println("Enter the deadline of the jobs to be scheduled");
	for(int i=0;i<n;i++)
	{
		a[i] = s.nextInt();
	}
	int b[] = new int[n];
	System.out.println("Enter the profit of the jobs to be scheduled");
	for(int i=0;i<n;i++)
	{
		b[i] = s.nextInt();
	}
	 ArrayList<P> ar = new ArrayList<P>();
     for(int i=0;i<n;i++)
     {
   	  ar.add(new P(a[i],b[i]));
     }
     Collections.sort(ar,new sortbye());
     P p = new P();
		for(int i = 0;i<ar.size();i++)
		{
			p = ar.get(i);
			a[i] = p.st;
			b[i] = p.et;
		}	
		/*for(int i=0;i<n;i++)
		{
			System.out.println("("+a[i]+","+b[i]+")"+" ");
		}*/
	int res[] =new int[n];
	for(int i=0;i<n;i++)
	{
		res[i]=-1;
	}
    boolean ts[]= new boolean[n];  
    for (int i=0; i<n; i++) 
        ts[i] = false; 
    for (int i=0; i<n; i++) 
    { 
       for (int j=Math.min(n,a[i])-1; j>=0; j--) 
       { 
          if (ts[j]==false) 
          { 
             res[j] = i; 
             ts[j] = true;
             break; 
          } 
       } 
    } 
    for (int i=0; i<res.length; i++) 
    	if(res[i]!=-1)
         System.out.print(res[i]+" ");
 } 
}
