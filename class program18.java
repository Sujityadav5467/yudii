class program18
{
    public static void main(String[] argss)
    {
        int n = sc.nextInt();
        int i = 1;
        int count = 0;
        while(i<=n/2)
        {
            if(n%i==0)
            {
                System.out.println(i);
                count++;
            }
            i++;
        }
        System.out.println("total factor :" + count);
    }
}