import java.util.Scanner;
class Pattern4
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
        printPattern(n);

    }
  
    public static void printPattern(int n)
    {
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=n; j++)
            {
                char  a = '(';
                int b = i;
                char  c = '\'';
                int d = j;
                char  e = ')';
                System.out.printf("%c%2d%c%2d%c ", a,b,c,d,e);
            }
            System.out.println();
        }
    }
}