import java.util.Scanner;
class Cylinder
{
  public void getValues()
    {

      Scanner sc = new Scanner(System.in);
      System.out.println("YOU HAVE SELECTED CYLINDER");
      System.out.println("-----------******-----------");
      System.out.println("Enter The Radius");
      int h = sc.nextInt();
      System.out.println("Enter The Height");
      int r = sc.nextInt();
      long c = 2*22/7*r*(h+r);
      System.out.println("Total Surface Area of Cylinder is : "+ c +"square units");
    }
}