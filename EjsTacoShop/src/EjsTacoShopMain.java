
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;


public class EjsTacoShopMain {

	public static void main(String[] args) throws IOException{
		PPPMenu();
	}

	public static void PPPMenu() throws IOException{
		FileOutputStream cafeMenu = new FileOutputStream ("EJsTacosMenu.txt");
		PrintWriter menuItems = new PrintWriter(cafeMenu);
		
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
	
}
