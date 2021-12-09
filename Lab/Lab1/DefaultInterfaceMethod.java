interface DefaultInterfaceMethod
{
    public void display();
    default void show()
    {
      System.out.println("Show Default Method");
    }
}
  
class Interface implements DefaultInterfaceMethod
{
    public void display()
    {
        System.out.println("Show Abstract Method");
    }
  
    public static void main(String args[])
    {
        Interface i = new Interface();
        i.display();
  
        // default method executed
        i.show();
    }
}