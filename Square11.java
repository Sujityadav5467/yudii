import java.util.Scanner;
class Square11
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double sum = 0;
        double i = 1;
        while(i<=100)
        {
            sum = sum + (1.0/i);
            System.out.println(sum);
            i++;
        }
System.out.println("the total sum of all number:" + sum);
    }
}