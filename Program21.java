import java.util.Scanner;
class Program21
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER");
        int rem = 0;
        int n = sc.nextInt();
        while(n>0)
        {
             rem = n%10;
            System.out.println(rem);
            n=n/10;
        }
    }
}