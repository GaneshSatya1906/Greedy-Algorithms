import java.util.*;
import java.io.*;
public class Sample1 {
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
      int curr_time=start[0];
      //System.out.print("Process 1"+" ");
      for(int i=0;i<n;i++)
      {
    	  if(start[i]>=curr_time)
    	  {
    		  curr_time = finish[i];
    		  System.out.print("Process"+""+(i+1)+" ");
    	  }
    	  
      }
	}

}
