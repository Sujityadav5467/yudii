import java.util.Scanner;
class ButterflyNum12{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter n: ");
		int n=sc.nextInt();
		printPattern(n);	
	} 
	public static void printPattern(int n){
		int x=1;
		int leftstar=1;		int rightstar=n;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				if(j<=leftstar || j>=rightstar){
					System.out.printf("% 3d",n);
					x++;
				}
				else
					System.out.print("  ");
			}
			if(i<n/2+1){
				leftstar++;	rightstar--;
			}else{
				leftstar--;	rightstar++;

			} 
		System.out.println();
		}
	}
}






