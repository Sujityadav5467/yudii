import java.util.Scanner;
class EmptySquare
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("entre the number");
        int n = sc.nextInt();
        getPattern(n);
    }
    public static void getPattern(int n)
    {
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=n; j++)
            {
                if(i==1 || i==n || j==1 || j==n)
                System.out.print("* ");
                else
                System.out.print("  ");

            }
            System.out.println();
        }
    }
}