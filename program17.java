class program17
{
    public static void main(String[] args)
    {
        int i = 1;
        int count = 0;
        while(i<=1000)
        {
            if(i%7==0 && i%10==7)
            {
             System.out.println(i);
             count++;
            }
        i++;
        }
        System.out.println("the total number are:" + count);
    }
}