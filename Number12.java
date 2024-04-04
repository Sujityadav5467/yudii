import java.util.Scanner;
class Perfect_number12{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //int i = 1;
        while(n>0)
        {
            int rem = n % 10 ;
            System.out.println(rem);
            n = n/10;
        }
        
    }

}