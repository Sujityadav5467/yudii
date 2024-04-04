import java.util.Scanner;
class Pattern9
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=n; j++)
            {
                
                if(i+j<n+1)
                System.out.printf(" ");
                
                else
                System.out.printf("%4d",i);
            }
            System.out.println();
        }
    }
}