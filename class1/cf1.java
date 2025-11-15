package lec1;

import java.util.Scanner;

public class cf1 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		int t=sc.nextInt();
		
		while(t-->0) {
			int n=sc.nextInt();
			
			int min=Integer.MAX_VALUE;
			
			int max=Integer.MIN_VALUE;
			
			int arr[]= new int[n];
			
			for(int i=0;i<n;i++) {
				
				int a=sc.nextInt();
				arr[i]=a;
				if(i==0) {
					max=0;
					min=0;
				}
				
				if(arr[max]<arr[i]) {
					max=i;
				}
				
				if(arr[min]>arr[i]) {
					min=i;
				}
			}
			
			if((arr[max]-arr[min])==0)System.out.println("No");
			
			else {
				
				System.out.println("Yes");
				System.out.print(arr[max]+" "+arr[min]+" ");
				for(int i=0;i<arr.length;i++) {
					
					if(i==max || i==min)continue;
					
					System.out.print(arr[i]+" ");
				}
				
				System.out.println();
				
			}
			
			
			
			
			
			
			
		}
		

	}

}
