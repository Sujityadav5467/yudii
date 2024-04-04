import java.util.Scanner;
class Head2
{
    public void getControl()
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        switch(n)
        {
            case 1 :
            Sphere s1 = new Sphere();
            s1.getValues();
            break;
            case 2 :
            Cone c1 = new Cone();
            c1.getValues();
            break;
            case 3 :
            Cylinder c5 = new Cylinder();
            c5.getValues();
            break;
            case 4 :
            Cube c4 = new Cube();
            c4.getValues();
            break;
            default :
            System.out.println("Enter The Valid Number");
        }
    }
}