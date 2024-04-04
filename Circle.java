import java.util.Scanner;
class Circle
{
  public void getValues()
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("YOU HAVE SELECTED CIRCLE");
      System.out.println("-----------******-----------");
      System.out.println("Enter The Radius");
      double a = sc.nextDouble();
      double c = 22/7*(a*a);
      System.out.println("Area of Circle is : "+ c );
    }
}