import java.util.Scanner;  // Import the Scanner class


public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner myObj = new Scanner(System.in);  // Create a Scanner object
	    System.out.println("Enter username");


	    String userName;
	do{
			
	    userName = myObj.nextLine();  // Read user input
	}while(userName.equals("n")||userName.equals("N"));
	
    
	System.out.println("Username is: " + userName);  // Output user input

	
	}
}
