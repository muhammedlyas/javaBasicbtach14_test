package reviewclass3;

public class LogicalOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean programmer=true;
		boolean manualTester=true;
		boolean knowFramework=false;
		
		if(programmer && manualTester&&knowFramework)
		{
			System.out.println("You can be an automation engineer");
		}
		else 
		{
			System.out.println("You must know a programming language and manual testing" + " to be an automation engineer");
		}
	}

}
