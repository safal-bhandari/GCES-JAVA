
public class ChainedException {
    public static void main (String args[])throws Exception { 
        int num1 = 1, num2=0, result = 0;
        try { 
            result = num1/num2;
            System.out.println(result);
        } catch(ArithmeticException error1) { 
            System.out.println ("Error"+error1);
            try { 
                throw new NumberFormatException();
            } catch(NumberFormatException error2) {
                System.out.println ("Chained exception : "+error2);
            }
        }
    }
}
