class Cube12
{
    public static void main(String[] args)
    {
        int i = 1;
        int sum = 0;
        while(i<=10)
        {
            sum = sum + i*i*i;
            i++;
        }
        System.out.println("the sum of all cube is:"+ sum);
    }
}