import java.util.Scanner;
class Pattern7
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
        int count =0;
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=n; j++)
            {
                if(i+j<n+1)
                System.out.print("* ");
                count++;
            }
            System.out.println();
        }
        System.out.println("total count is : "+ count);
    }
}