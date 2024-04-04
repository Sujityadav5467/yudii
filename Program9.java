class Program9
{
    public static void main(String[] args)
    {
        test(0);
    }
    public static void test(int n)
    {
        if(n<=10)
        {
            System.out.println(n +" ");
            test(n+1);
        }
    }
}