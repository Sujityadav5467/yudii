import java.util.Scanner;
class Cone
{
  public void getValues()
    {

      Scanner sc = new Scanner(System.in);
      System.out.println("YOU HAVE SELECTED CONE");
      System.out.println("-----------******-----------");
      System.out.println("Enter The Length");
      int l = sc.nextInt();
      System.out.println("Enter The Radius");
      int r = sc.nextInt();
      long c = 22/7*r*(l+r);
      System.out.println("Total Surface Area Of Cone is : "+ c);
    }
}