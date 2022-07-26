package learning;

import java.util.Scanner;

public class Prog {

	public static void main(String[] args) {
	
			Scanner sc =new Scanner(System.in);
			System.out.println("enter number");
			int num=sc.nextInt();
			int count=0,temp=num,index=0;
			
			while(temp>0)
			{
				temp=temp/10;
				count++;
			}
			//System.out.println(count);
			temp=num;
			int arr[]=new int[count];
			for(int i=count-1;i>=0;i--) {
				arr[i]=temp%10;
				temp=temp/10;
			}
			//for(int i=0;i<count;i++) {
			//	System.out.println(arr[i]);
			//}
			boolean b=true;
			for(int i=0;i<count-1;i++) {
				if(arr[i]<arr[i+1]) {
					b=false;
				}
			}
			//System.out.println(b);
			if(b==false) {
				for(int i=count-1;i>=0;i--) {
					for(int j=i-1;j>=0;j--) {
						if(arr[i] > arr[j]) {
							int t=arr[i];
							arr[i]=arr[j];
							arr[j]=t;
							b=true;
							index=j;
							break;
						}
				
					}
					if (b==true)
						{break;}
				}
				
			for(int a=index+1;a<count;a++) {
				for(int g=a+1;g<count;g++) {
					if(arr[a]>arr[g]) {
						int te=arr[a];
						arr[a]=arr[g];
						arr[g]=te;
					}
				}
			}	

					
				
			
				
			}
			
			//System.out.println(index);
			for(int i=0;i<count;i++) {
				System.out.print(arr[i]);
			}
			
	
		
			
			
			
}
	
}	
	

