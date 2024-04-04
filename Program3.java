//if variable hiding in case of static members then
// we can overcome this by using Class Name as reference
class Program3
{ 
    static int x = 30;
    public static void test()
    {
        // variable hiding in case of non-static members 
      int x =50;
      System.out.println("THIS IS TEST METHOD");
      System.out.println("local variable x : "+x);
    
      //here global variable (static int x =30) is called by class name reference(Program3)
      System.out.println("global variable of x : "+Program3.x);
    }
    public static void main(String[] args)
    {
        test();
    }
    /* ==VARIABLE HIDING==
     * variable hiding is a process when local and global variable will exist with the same name.
     * In this case preference is given to a local variable and global variable gets hidden which 
     * is called a Variable Hiding.
     */
}