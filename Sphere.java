import java.util.Scanner;
class Sphere
{
  public void getValues()
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("YOU HAVE SELECTED SPHERE");
      System.out.println("-----------******-----------");
      System.out.println("Enter The Radius");
      int r = sc.nextInt();
      long c = 4*22/7*(r*r);
      System.out.println("Area of Sphere is : "+ c + "square units");
    }
}