package learning;

public class prog2r {
	public static Integer[] assign(Integer arr[],String s) {
		for(int i=0;i<s.length();i++) {
			String s2=s.charAt(i)+"";
			arr[i]=Integer.valueOf(s2);
		}
		return arr ;
	}
	public static void add(Integer a[],Integer b[],int len) {
		int t=0;
		for(int i=len-1;i>=0;i--) {
			t=t+a[i]+b[i];
			a[i]=t%10;
		}
	}
	public static void main(String[] args) {
		String s1="5532326351";
		String s2="6332365626";
		Integer arr1[]=new Integer[s1.length()];
		Integer arr2[]=new Integer[s2.length()]; 
		arr1=assign(arr1,s1);
		arr2=assign(arr2,s2);
		
		for(int i=0;i<arr2.length;i++)
		{
			System.out.print(arr2[i]);
		}
		if(arr1.length>arr2.length) {add(arr1,arr2,arr1.length);} 
		else if(arr1.length<arr2.length) {add(arr2,arr1,arr2.length);}
		else {add(arr1,arr2,arr2.length);}
	}

}
