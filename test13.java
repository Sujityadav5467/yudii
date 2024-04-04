import java.util.Scanner;
class test13
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER");
        int n = sc.nextInt();
        int i = 1;
        int sum = 0;
        while(i<=n/2)
        {
            if(n%i==0)
            {
                sum = sum + i;
               // i++;
            }
            i++;
        }
        if(sum==n)
        {
            System.out.println("PERFECT NUMBER");

        }else
        {
            System.out.println("NOT PERFECT NUUMBER");
        }
    }
}