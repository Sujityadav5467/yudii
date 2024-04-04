class Swap
{
    public static void main(String[] args)
    {
        int a = 12;
        int b = 18;
        System.out.println("before swapping");
        System.out.println("a is : "+ a);
        System.out.println("b is : "+ b);
        b = a+b;
        a = b-a;
        b = b-a;
        System.out.println("after swapping");
        System.out.println("a is : "+a);
        System.out.println("b is : "+b);
    }
}