import java.util.Scanner;
class Body
{
    public void start()
    {
        Scanner sc = new Scanner(System.in);
        Body b1 =  new Body();
        int n = sc.nextInt();
        Head h1 = new Head();
        Head2 h2 = new Head2();
            if(n==1)
            {
                b1.get2D();
                h1.getControl();
            }
                else if(n==2)
                {
                    b1.get3D();
                    h2.getControl();
                }else 
                    System.out.println("Please Enter a Valid Number");
    }
    public void get2D()
    {
        System.out.println("Welcome To 2D World");
        System.out.println("_____________________");
        System.out.println("press 1 for RECTANGLE");
        System.out.println("press 2 for SQUARE");
        System.out.println("press 3 for TRIANGLE");
        System.out.println("press 4 for CIRCLE");
    }
    public void get3D()
    {
        System.out.println("Welcome To 3D World");
        System.out.println("_____________________");
        System.out.println("press 1 for SPHERE");
        System.out.println("press 2 for CONE");
        System.out.println("press 3 for CYLINDER");
        System.out.println("press 4 for CUBE");
    }
}