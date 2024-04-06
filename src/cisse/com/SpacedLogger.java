package cisse.com;

public class SpacedLogger implements Logger {

	@Override
	public void log(String str) {
		// TODO Auto-generated method stub
		for (int i = 0; i < str.length(); i++) {
			
			System.out.print(str.charAt(i) + " ");
		}
		
		System.out.println();
		
	}

	@Override
	public void error(String str) {
		// TODO Auto-generated method stub
		System.out.print("ERROR: ");
		
		for (int i = 0; i < str.length(); i++) {
			
			System.out.print(str.charAt(i) + " ");
		}
		
		System.out.println();
		
		
	}

	

}
