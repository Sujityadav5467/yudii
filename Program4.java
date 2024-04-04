/*if variable hiding in case of non-static variable then we can overcome
 * this by using "this" keyword;
 */
class Program4
{
    int  y = 50;
    public void demo()
    {
        //variable hiding in case of non-static variable;
        int y = 70;
        System.out.println("this is DEMO METHOD ");
        System.out.println("local value of y is : "+y);
        //here the global varibale (int y) is called by "this" keyword;
        System.out.println("global variable of y is : "+ this.y);
    }
    public static void main(String[] args)
    {
        Program4 p = new Program4();
        p.demo();
    }
    /*variable hiding
     * it the process in which the local and global variable are exist in the same program
     * and the prefrences is given to local instread of the global and the global variable gets hidden,hence this process is called 
     * variable hiding.
     */
}