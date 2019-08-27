import java.util.*;
import java.io.*;
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
		if(p1.et > p2.et) return 1;
		else if(p1.et <p2.et) return -1;
		else return 0;
	}
}
public class As {
	public static void main(String args[])
	{
      Scanner s = new Scanner(System.in);
      System.out.print("Number of Processes");
      int n = s.nextInt();
      int[] start = new int[n];
      int[] finish = new int[n];
      System.out.println("Enter the Start Details");
      for(int i=0;i<n;i++)
      {
    	  start[i] = s.nextInt();
      }
      System.out.println("Enter the Finish Details");
      for(int i=0;i<n;i++)
      {
    	  finish[i] = s.nextInt();
      }
      ArrayList<P> a = new ArrayList<P>();
      for(int i=0;i<n;i++)
      {
    	  a.add(new P(start[i],finish[i]));
      }
      Collections.sort(a,new sortbye());
      P p = new P();
		for(int i = 0;i<a.size();i++)
		{
			p = a.get(i);
			start[i] = p.st;
			finish[i] = p.et;
		}
      int curr_time=start[0];
      //System.out.print("Process 1"+" ");
      for(int i=0;i<n;i++)
      {
    	  if(start[i]>=curr_time)
    	  {
    		  curr_time = finish[i];
    		  System.out.print("("+start[i]+","+finish[i]+")"+"  ");
    	  }
    	  
      }
	}

}


