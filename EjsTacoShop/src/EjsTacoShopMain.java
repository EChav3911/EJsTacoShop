
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


public class EjsTacoShopMain {

	public static void main(String[] args) throws IOException{
		PPPMenu();
		CallOutMenu();
	}

	public static void PPPMenu() throws IOException{ 
	/*This method will create the menu items, and allow for updates to the menu*/
		
		FileOutputStream cafeMenu = new FileOutputStream ("EJsTacosMenu.txt");   //Here FileOutputStream creates a new file "EJsTacosMenu.txt" if it doesn't already exist, and overwrites the file if it does exist
		
		PrintWriter menuItems = new PrintWriter(cafeMenu);                       //Here we will attach PrintWriter to the newly created text file, "EJsTacosMenu.txt".  PrintWriter allows us to write data to the file as simple strings
		
		/*menuItems has been declared as a PrintWriter object, and we use it here to add String to the text file "EJsTacosMenu.txt"*/
		menuItems.println("Hello, here are todays menu Items\n");
		menuItems.println("1.Tacos");
		menuItems.println("\ta) Steak:    2.00");
		menuItems.println("\tb) Chicken:  1.75");
		menuItems.println("\tc) Fish:     2.25\n");
		menuItems.println("2.Buritos");
		menuItems.println("\ta) Steak:    10.00");
		menuItems.println("\tb) Chicken:  8.00\n");
		menuItems.println("3.Tortas");
		menuItems.println("\ta) Steak:    6.50");
		menuItems.println("\tb) Milanesa: 7.25\n");
		menuItems.println("4.Flautas:");
		menuItems.println("\ta) Beef:     1.25");
		menuItems.println("\tb) Chicken:  1.00\n");
		menuItems.println("5.Quesadilla:  1.00");
		menuItems.println("\ta) Steak:   +1.00");
		menuItems.println("\tb) Chicken: +0.75");
		menuItems.println("\tc) Shrimp:  +1.50\n");
		menuItems.println("6.Soda:        1.25\n");
		menuItems.println("7.Churros (2): 2.00");
		
		menuItems.close();
	}
	
	public static void CallOutMenu() throws IOException {  
	/*This method brings up the menu for the customer to select their order from*/
		
		FileInputStream readFile = new FileInputStream("EJsTacosMenu.txt");
		Scanner outputMenu = new Scanner(readFile);
		
		while (outputMenu.hasNextLine()) {
			String currentLine = outputMenu.nextLine();
			System.out.println(currentLine);
		}
		
		outputMenu.close();
	}
	
	public static void
	
}
