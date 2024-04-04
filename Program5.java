class Program5
{
    public static void main(String[] args)
    {
      System.out.println("this is main method");
      test(1);
      System.out.println("main ends");

    }
    public static void test(int x)
    {
        System.out.println("this is test method "+x);
        if(x<=10)
        {
            test(x+1);
        }

    }
}