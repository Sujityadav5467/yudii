class Vehicle
{
    String name;
    double price;
    String colour;
    public void setValue(String name,double price,String colour)
    {
        this.name =name;
        this.price = price;
        this.colour = colour;

    }
    public void displayDetails()
    {
        System.out.println("name is : "+ name);
        System.out.println("price is : "+ price);
        System.out.println("colour is : "+ colour);
        System.out.println("======================");
    }
}