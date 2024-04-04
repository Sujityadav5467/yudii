import java.util.Scanner;
class Pattern12
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
        int count=0;
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=n; j++)
            {
                
            System.out.print(i+","+j+",");
            count++;
                
            }
            System.out.println();
        }
        System.out.println("the total count is : "+ count);
    }
}