import java.util.Scanner;
class Pattern5
{
    int k ;
    public static void main(String[] args)
    {
        int count =0;
       // int k=12;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
        for(int i=1; i<+n; i++)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print("*");
              //  k++;
                count++;
            }
            System.out.println();
        }
        System.out.println("total count is : "+ count);
    }
}