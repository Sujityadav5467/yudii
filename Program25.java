import java.util.Scanner;
class Program25
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER");
        int count = 0;
        int n = sc.nextInt();
        int rem = 0;
        while(n>0)
        {
            rem = n%10;
            if(rem%2!=0)
            count ++;

            n = n/10;
        }
        System.out.println("the total odd digit is " +  count);
    }
}