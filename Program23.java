import java.util.Scanner;
class Program23
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER");
        int count = 0;
        int n = sc.nextInt();
        while(n>0)
        {   
            if(n%2==0)
            count++;
            n=n/10;
        }
        System.out.println("the total  even digits"  + count);
    }
}