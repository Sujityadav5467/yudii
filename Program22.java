import java.util.Scanner;
class Program22
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
       // int rem = 0;
        while(n>0)
        {
          int rem = n % 10;
            if(n%2==0){
              //  System.out.println("the even digit is");
            System.out.println(rem);
            }
            n = n/10;

        }
       
    }
}