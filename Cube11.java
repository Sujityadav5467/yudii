import java.util.Scanner;
class Cube11
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int i = 1;
        while(i<=99)
        {
            sum = sum + i*i+(i+1);
            System.out.println(sum);
            i++;
        }
        System.out.println(sum);
    }
}