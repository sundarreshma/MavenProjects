package excptn;

public class TryCatchBlock {
	
	
		public static void main(String[] args) {

			try {
				
				int a = 10;
				System.out.println("Arithmetic exception");
				System.out.println(a / 0); // Arithmetic exception

			} catch (Exception e) {
				
				System.out.println(e.getMessage());

			}
			
			
			String s=null;
			try {
				System.out.println("Null pointer exception");
			    System.out.println(s.length()); //NullPointerException
			
			}
			catch(NullPointerException e)
			{
				System.out.println(e.getMessage());//or e 
			}
			
			String y="145g";//abc to number not able to cast
			
			try {
				System.out.println("number format exception");
				int i=Integer.parseInt(y);//NumberFormatException
			    System.out.println(i);
			}
			catch(NumberFormatException e)
			{
				System.out.println(e);
				
			}
			
			
			int []arry=new int[5];//ArrayIndexOutOfBoundsException
			try {
				System.out.println("array outof bound exception");
			    arry[5]=10;
			}
			
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println(e.getLocalizedMessage());
			}
			
			//finally can have after try catch or after try
			finally 
			{
			//execute irrespective of exception handled or not handled with catch block
				
				System.out.println("Finally block");
			}
			
			

			try
			{
				int []arry2=new int[5];//exceptn not handled but still finally block will execute/no exception still finally will execute
			    arry2[5]=10;
			}
			finally {
				System.out.println("jjii");
				System.out.println("j");
			}
			
		

	}


}
