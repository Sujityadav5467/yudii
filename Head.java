import java.util.Scanner;
class Head
{
    public void getControl()
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        switch(n)
        {
            case 1 :
            Rectangle r1 = new Rectangle();
            r1.getValues();
            break;
            case 2 :
            Square s1 = new Square();
            s1.getValues();
            break;
            case 3 :
            Triangle t1 = new Triangle();
            t1.getValues();
            break;
            case 4 :
            Circle c1 = new Circle();
            c1.getValues();
            break;
            default :
            System.out.println("Please Enter The Valid Number");
        }
    }
}