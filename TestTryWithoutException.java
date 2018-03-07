package Handling;

public class TestTryWithoutException {
	
	public static void main(String[] args) {
		
		int a = 10;
		int b = 2;
	
		try{
		
			int c = a/b;
			System.out.println(c);
		}
	
		catch(Exception e){
			System.out.println("This is the error : "+ e.getMessage());		
		}
		
		finally{
			System.out.println("It will be executed regardless of Exception occur or not or thrown or not");
		}
	
}


}
