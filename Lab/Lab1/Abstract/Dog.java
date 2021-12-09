class Dog extends Animal{
    public void sound(){
        System.out.println("Sleeping");
    }
}

class AbstractDemo{
    public static void main(String[] args){
        Dog dog = new Dog;
        dog.sound();
        dog.sleep();
    }
}

