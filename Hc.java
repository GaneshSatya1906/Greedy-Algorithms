import java.util.PriorityQueue;
import java.util.*;
class Hnode
{
	char c;
	int data;
	Hnode left;
	Hnode right;
	Hnode(char c,int data)
	{
		this.c =c;
		this.data = data;
		left =null;
		right=null;
	}
	Hnode(){}
}
class sortbyf implements Comparator<Hnode>
{
	public int compare(Hnode h1,Hnode h2)
	{
		return (h1.data - h2.data);
	}
}
public class Hc {

	public static void print(Hnode root, String str) 
    { 
  
      if (root.left == null && root.right == null  && Character.isLetter(root.c))
             { 
                 System.out.println(root.c + ":" + str); 
                 return; 
             } 
        print(root.left, str + "0"); 
        print(root.right, str + "1"); 
    } 

    public static void main(String[] args) 
    { 
          Scanner s = new Scanner(System.in); 
          System.out.println("Enter number of characaters");
          int n = s.nextInt(); 
          System.out.println("Enter the string containing characters");
          String st = s.next();
          char[] ca = st.toCharArray(); 
          System.out.println("Enter the corresponding frequencies");
          int[] cf = new int[n];
          for(int i=0;i<n;i++)
          {
        	  cf[i] = s.nextInt();
          }
          PriorityQueue<Hnode> q = new PriorityQueue<Hnode>(n, new sortbyf()); 
          for (int i = 0; i < n; i++) 
           { 
            Hnode hn = new Hnode(ca[i],cf[i]); 
            q.add(hn); 
           } 
          Hnode root = null; 
          while (q.size() > 1) 
          { 
            Hnode a = q.peek(); 
            q.poll();  
            Hnode b = q.peek(); 
            q.poll(); 
            Hnode r = new Hnode(); 
            r.data = a.data + b.data; 
            r.c = '-'; 
            r.left = a; 
            r.right = b;  
            root = r; 
            q.add(r); 
           }  
        print(root, ""); 
    } 
} 
