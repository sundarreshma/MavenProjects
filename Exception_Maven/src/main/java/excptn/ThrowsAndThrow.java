package excptn;



public class ThrowsAndThrow {

	
	public static void exceptionMethod() throws ArithmeticException
	 {
		throw new ArithmeticException("Trying to divide by 0");
	 }

	public static void main(String[] args) {

		try
		{
			exceptionMethod();
			
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}
		
		ThrowsAndThrow.exceptionMethod();

	}

}
