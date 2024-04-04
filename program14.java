import java.util.Scanner;
class program14
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        int i = 1;
        while(i<n/2){
            if(n%i==0);{
            System.out.println(i);
            count++;
            }
            i++;
        }
        System.out.println("the total factors;" + count);
    }
}