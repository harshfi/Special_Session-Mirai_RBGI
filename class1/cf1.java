import java.util.Scanner;

public class cf1 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		int t=sc.nextInt();
		
		while(t-->0) {
			int n=sc.nextInt();//cin>>n;
			
			int k=sc.nextInt();//cin>>k;
			
			int prev=Integer.MIN_VALUE;  //Int_min
			
			boolean sort=true;
			for (int i = 0; i <n; i++) {
				int a=sc.nextInt(); //cin>>a;
				
				if(prev>a) {
					sort=false;
				}
				prev=a;
			}
			
			if(k>=2 ||sort==true) {
				System.out.println("Yes");// cout<<"Yes";
			}
			else {
				System.out.println("No");//cout<<"No";
			}
			
		}
		

	}

}
