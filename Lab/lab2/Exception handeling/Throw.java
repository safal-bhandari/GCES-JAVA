public class Throw {
    public void voting (int age)
	{
		if (age < 18) {
			throw new ArithmeticException("Not eligible to vote");
		}
        else{
            System.out.println("Eligible to vote");
        }
	}
    public static void main(String[] args)
	{
		Throw demo = new Throw();
		try {
			demo.eligibility(17);
		}catch(ArithmeticException error) {
			System.out.println("Error "+error.getMessage());
		}

	}
}
