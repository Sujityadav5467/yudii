import java.util.Scanner;
class Program99
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");5 
        double sum = 0;
        double i = 1;
        double n = sc.nextInt();
        while(i<=n)
        {
            sum = sum +(1.0/i*i);
            System.out.println(sum);
            i++;
        }
        System.out.println("the sum of the number" + sum);
    }
}