import java.util.Scanner;
class PatternAlphabet
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
        getPattern(n);
    }
    public static void getPattern(int n)
    {
        char x ='A';
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print(x+"  ");
                x++;
            }
            System.out.println(); 
        }
    }
}