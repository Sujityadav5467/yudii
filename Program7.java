import java.util.Scanner;
class Program7
{
    static int sum =0;
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
        test(n);
        System.out.println("the sum is "+ sum);
    }
    public static void test(int x)
    {
        if(x>0)
        {

            sum = sum +x;
         //   System.out.println("the sum of x "+ x);
            test(x-1);
        }
    }
}