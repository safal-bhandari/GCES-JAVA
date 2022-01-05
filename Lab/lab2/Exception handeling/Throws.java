class Throws
{
    static void fun() throws IllegalAccessException
    {
        System.out.println("Hello");
        throw new IllegalAccessException("Success");
    }
    public static void main(String args[])
    {
        try
        {
            fun();
        }
        catch(IllegalAccessException e)
        {
            System.out.println("catch");
        }
    }
}