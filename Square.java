import java.util.Scanner;
class Square
{
  public void getValues()
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("YOU HAVE SELECTED SQUARE");
      System.out.println("-----------******-----------");
      System.out.println("enter the Side");
      int a = sc.nextInt();
      long c = a*a;
      System.out.println("Area of Square is : "+ c);
    }
}