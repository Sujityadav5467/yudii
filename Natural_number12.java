import java.util.Scanner;
class Natural_number12
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
        int sum = 0;
        int i = 1;
        while(i<=n)
        {
            sum = sum + i;
            i++;
        }
        System.out.println("the sum of numbers is:" + sum);
    }
}