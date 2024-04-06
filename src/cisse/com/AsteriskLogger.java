package cisse.com;

public class AsteriskLogger implements Logger {


	@Override
	public void log(String str) {
		// TODO Auto-generated method stub
		System.out.println("***" + str + "***");
		
	}

	@Override
	public void error(String str) {
		// TODO Auto-generated method stub
		String newStr = "***Error: " + str + "***";
		String asterisk = "*".repeat(newStr.length());
		
		System.out.println(asterisk);
		System.out.println(newStr);
		System.out.println(asterisk);
		
	}

}
