public class ExceptionHandlingDemo3 {

	static void checkAge(int age) throws ClassNotFoundException {
		if (age < 18) {
			throw new ClassNotFoundException("Access denied - You must be at least 18 years old.");
		} else {
			System.out.println("Access granted - You are old enough!");
		}
	}

	public static void main(String[] args)  { 
			 try{
			   checkAge(15); 
			  }
			  catch(ClassNotFoundException ce)
			  {
			       System.out.println("Exception handled");
			  }

			 }
}