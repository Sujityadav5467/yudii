import java.util.Scanner;
class Pattern3
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
        int k = 1;
        for(int i =1; i<=n; i++)
        {
            for(int j=1; j<=n; j++)
            {
                System.out.print(k);
                System.out.print(" ");
                k++;
            }
            System.out.println();
        }
    }
}