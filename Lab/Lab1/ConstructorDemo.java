class ConstructorDemo{
    int a;
    public ConstructorDemo(){
        a = 10;
        System.out.println(a);
    }

    public ConstructorDemo(int b){
        a = a+b;
        System.out.println(a);
    }
    
    public static void main(String[] args){
        ConstructorDemo constructorDemo = new ConstructorDemo(); //Default Constructor
        ConstructorDemo constructorDemo1 = new ConstructorDemo(5); // Parameterized Constructor
    }
}

