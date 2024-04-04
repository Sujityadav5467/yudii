import java.util.Scanner;
class Number111
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
             // when you only print the even digit from input user number.
          //   if(n%2==0)
            System.out.println(rem);
            n=n/10;
        }
    }
}