import java.util.Scanner;
class Program12
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = n%10;
        n=n/10;
        int y=n%10;
        if(x>y)
        {
            System.out.println("the last two digit is increasing order");
        }else{
            System.out.println("the last two digit is not incresing order");
        }
    }
}