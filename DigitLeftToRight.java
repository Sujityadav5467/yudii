import java.util.Scanner;
class DigitLeftToRight
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
        int a = n;
        int count = 0;
        while(n>0){
            count++;
            n =n/10;
        }
        while(count>0){
            int digit = (int)(n /math.pow(10, count-1) )%10;
            System.out.println(digit);
            count--;
        }
    }

}