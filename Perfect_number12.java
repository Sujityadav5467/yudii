import java.util.Scanner;
class Perfect_number12
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int i = 1;
        System.out.println("ENTER THE NUMBER");
        int sum = 0;
        int n = sc.nextInt();
        while(i<=n/2)
        {
            if(n%i==0)
            sum = sum + i;
            i++;
        }
        if(sum==n)
        {
            System.out.println("PERFECT NUMBER");

        }
        else{
            System.out.println("NOT PERFECT NUMBER");
        }
    }
}