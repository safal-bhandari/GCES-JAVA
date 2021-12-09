class ThisSuperFinal {
    int a = 10;
    final void show()
    {
        System.out.println("ThisSuperFinal method defined");
    }
}


class ThisSuperFinalChild extends ThisSuperFinal {
    public ThisSuperFinalChild(int a){  
        this.a= a;  
    } 

    void display() {
        System.out.println(super.a);
    }
    public static void main(String args[]) {
        ThisSuperFinalChild child = new ThisSuperFinalChild(10);
        child.show();
        child.display();
    }
}
