class Program6
{
	public static void main(String[] args)
	{
		System.out.println("main method starts");
		test(0);
		System.out.println("main method ends");
		
	} 
	public static void test(int x)
	{
		System.out.println("This is test method: "+x);
		if(x>=10){
			test(x-1);
		}
		System.out.println("Outside if x is: "+x);
	}
}