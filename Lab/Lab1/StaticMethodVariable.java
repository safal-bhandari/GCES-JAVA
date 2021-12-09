class StaticMethodVariable{  
    static int count=0;
    StaticMethodVariable()
    {  
        count++;
        System.out.println(count);  
    }

    static void count(){  
        count++;
    }  
    public static void main(String args[]){ 
        StaticMethodVariable.count();
        StaticMethodVariable counter=new StaticMethodVariable(); 
    }  
}  