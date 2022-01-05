public class InvalidAge
{

    public void validate(int age)
    {
        if(age < 1 || age > 100){
            throw new ArithmeticException("Sorry");
        }
    }
    public static void main(String[] args) {
        InvalidAge i = new InvalidAge();
        try{
            i.validate(180);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
