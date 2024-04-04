class Temp
{
    String name;
    double price;
    String colour;
    String gender = "male";
        public static void main(String[] args)
    {
        Temp t1 = new Temp();
        System.out.println("this is main method");
        t1.getValue("car",1234.65,"white");
        t1.displayDetails();
        t2.getValue("bus",4433.56,"red");
        t2.displayDetails();
        t3.getValue("train",6564.67,"blue");
      // gender ="female";
    }
    public void getValue(String name,double price,String colour)
    {
        System.out.println("this is getvalue method");
        name = name;
        price = price;
        colour = colour;
        displayDetails();
      //  System.out.println("gender is : "+ T1.gender);
    }
    public void displayDetails()
    {
        System.out.println("this is displayDetails method");
        System.out.println("name is : "+ name);
        System.out.println("price is : "+ price);
        System.out.println("colour is : "+ colour);
    }
}