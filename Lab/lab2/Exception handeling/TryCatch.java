public class TryCatch {
    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 0;
        int result = 0;
        try{
            result = num1/num2;
            System.out.println(result);
        }catch(ArithmeticException e){
            System.out.println("Error"+ e.getMessage());
        }
    }
}
