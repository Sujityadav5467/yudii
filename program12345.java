class program12
{
    public static void main(String[] args)
    {
        int n =2;
      int i = 1;
      while(i<=1000)
      {
        if(i%17==0){
            System.out.println(i);
           // i++;
        }
        i++;
      }
      while(n<=100){
        if(n%10==0){
        
            System.out.println(n);
        }
        n++;{
          //  System.out.println("case-2 started");
        }
      }
      System.out.println("====================" + i);
      System.out.println("the loop end"  + n);
    }
}