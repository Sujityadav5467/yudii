import java.util.Scanner;
class prime12
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        while(i<=n){
            System.out.println(2*i+1);
            i++;
        }
        System.out.println(i);
    }
}