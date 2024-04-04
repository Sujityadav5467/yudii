import java.net.SocketTimeoutException;
import java.util.Scanner;
class Practice

{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
        int  x = 1;
        int count = 0;
        for(int i=2; i<=n/2; i++)
        {
            x++;
            System.out.println("loop number is : " +x);
            if(n%i==0)
            {
                count++;
                break;
            }
        }
        if(count==0)
        System.out.println("it is prime number");
        else
        System.out.println("it is not prime number");
    }
}