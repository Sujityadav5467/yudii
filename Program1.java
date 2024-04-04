class Program1
{
    static int x=10;
    int a = 50;
    int z = 60;
    public static void main(String[] args)
    {
      int x = 20;
      System.out.println("======================");
      System.out.println("local values of x " + x);
      System.out.println("global value of global x "+ Program1.x);
      Program1 p =new Program1();
      p.test();
      p.demo();
    }
    public void test()
    {
        int a =40;
        System.out.println("=====================");
        System.out.println("this is test method");
        System.out.println("the local value of a "+ a  );
        System.out.println("the global value of a "+ this.a);

    }
	public void demo()
	{ 
		int x = 70;
	 System.out.println("=====this is demo method=====");
	System.out.println("local value of x : "+x);
        System.out.println("global value of x : "+ this.z);
	test();
	}
}