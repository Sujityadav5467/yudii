import java.util.Scanner;
class Cube
{
  public void getValues()
    {

      Scanner sc = new Scanner(System.in);
      System.out.println("YOU HAVE SELECTED CUBE");
      System.out.println("-----------******-----------");
      System.out.println("Enter The Adge");
      int a = sc.nextInt();
      long c = 6*(a*a);
      System.out.println("Surface Area of Cube is : "+ c);
    }
}