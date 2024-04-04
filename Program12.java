class Program12
{
int b=80;   
static int a =220;
public static void main(String[] args)
 {
   System.out.println("this is main method");
   int a = 10;
   System.out.println("local value a : "+a);
   System.out.println("grlobal value of a : "+Program12.a);
   Program12 p1 = new Program12();
   p1.test();
 }
   public void test()
   {
      int b=12;
	System.out.println("this is test method");
	System.out.println("local value of b :"+b);
	System.out.println("global value of b : "+ this.b);
   }
}   