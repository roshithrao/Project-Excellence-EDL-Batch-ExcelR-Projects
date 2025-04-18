public class ExceptionHandlingDemo2 {

	public static void main(String[] args) {

		try {
			int a[] = new int[5];
			a[7] = 30 / 2;
			System.out.println(a[4]);
		}
		catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception occurs");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBounds Exception occurs");
		} 
		catch (Exception e) {
			System.out.println("Parent Exception occurs");
		} 
		finally {
		System.out.println("rest of the code");
		}
	}
}