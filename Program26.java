import java.util.Scanner;
class Program26
{
    public static void main(String[] args)
    {
        // the factorial of each digit of the number.
         
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
        while(n>0)
        {
            int rem = n%10;
            int fact = 1;
            int i = 1;
            while(i<=rem)
            {
                fact = fact*i;
                i++;
            }
            System.out.println(rem + "!=" + fact);
            n = n/10;
        }

    }
}