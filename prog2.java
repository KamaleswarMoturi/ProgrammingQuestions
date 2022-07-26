package learning;
import java.util.*;



public class prog2 {
	public static ArrayList assign(ArrayList<Integer> list,String s) {
	    for(int i=(s.length()-1);i>=0;i--)
	    {
	    	String ss="" + s.charAt(i);
	    	list.add(Integer.valueOf(ss));
	    }
		return list;
	}
	public static void stringify(ArrayList<Integer> a) {
		String s="";
		for(int i=0;i<a.size();i++)
		{
			s=s+a.get(i);
		}
		System.out.println(s);
	}

	public static ArrayList add(ArrayList<Integer> list1,ArrayList<Integer> list2,int len) {
		int t=0;
		for(int i=0;i<=list1.size();i++)
		{
			if(i<len)
		           {
		                t=t+list1.get(i)+list2.get(i);
		                list1.set(i, t%10);
		                if(t>9)
		               {
			             t=1;
		               }
		               else {t=0;}
		
	               	}
			else if(t==1 && i<list1.size())
			{
				t=list1.get(i)+t;
				list1.set(i, t%10);
				 if(t>9)
	               {
		             t=1;
	               }
	               else {t=0;}
			}
			else if(t==1 && i==list1.size())
			{
				list1.add(1);
			}
		}
		Collections.reverse(list1);
		
		return list1;
		
}
	
	
	public static void main(String[] args) {
		String s1="1111111111111111111111111111111111111";
		String s2="11111111111111111111111111111111111111111111111111111111111111111111111111111111";
		ArrayList<Integer> list1=new ArrayList<>(); 
		ArrayList<Integer> list2=new ArrayList<>();
		Collections.copy(list1,assign(list1,s1));
		Collections.copy(list2,assign(list2,s2));
		//System.out.println(list1);
		//System.out.println(list2);
		if(list1.size()>list2.size()) {
			ArrayList<Integer> num=add(list1,list2,list2.size());
			//System.out.println(num);
			stringify(num);
		}
		else if(list1.size()<list2.size()) {
			ArrayList<Integer> num=add(list2,list1,list1.size());
			//System.out.println(num);
			stringify(num);
			}
		else {ArrayList<Integer> num=add(list1,list2,list2.size()); 
			//System.out.println(num);
			stringify(num);
		}
		
		
		
	}

}
