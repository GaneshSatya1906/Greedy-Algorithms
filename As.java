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
		if(p1.et > p2.et) return 1;
		else if(p1.et <p2.et) return -1;
		else return 0;
	}
}
class As
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		ArrayList<P> a = new ArrayList<P>();
		a.add(new P(1,4));
		a.add(new P(4,1));
		Collections.sort(a,new sortbye());
		P p = new P();
		for(int i = 0;i<a.size();i++)
		{
			p = a.get(i);
			System.out.println(p.st);
			
		}
    }
}
