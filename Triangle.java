import java.util.Scanner;
class Triangle
{
  public void getValues()
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("YOU HAVE SELECTED TRIANGLE");
      System.out.println("-----------******-----------");
      System.out.println("Enter The Base");
      double a = sc.nextDouble();
      System.out.println("Enter The Hight");
      double b = sc.nextDouble();
      double c = a*b;
      System.out.println("Area of Triangle is : "+ c +" square units");
    }
}