import java.util.Scanner;
class Rectangle
{
  public void getValues()
    {

      Scanner sc = new Scanner(System.in);
      System.out.println("YOU HAVE SELECTED RECTANGLE");
      System.out.println("-----------******-----------");
      System.out.println("Enter The Length");
      int a = sc.nextInt();
      System.out.println("Enter The Width");
      int b = sc.nextInt();
      long c = a*b;
      System.out.println("Area of Rectangle is : "+ c);
    }
}