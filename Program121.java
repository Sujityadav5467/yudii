import java.util.Scanner;
class Program121
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int count = 0;
        int i = 1;
        int n = sc.nextInt();
        while(i<n/2)
        {
            if(n%i==0){
                System.out.println(i);
                count++;
            }
            i++;
        }
        System.out.println("the total factors is :" + count);
    }
}