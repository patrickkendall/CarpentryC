import java.util.Scanner;

public class CarpentryChoice 
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		int Price = 0;
		boolean error = true; 
		String choice = "";
		System.out.println("Which type of product are you buying? Type in the number it corresponds to: \n 1. Table $250 \n 2. Desk $325 \n 3. Dresser $420 \n 4. Entertainment Center $600"); 
		System.out.println("Enter your choice:");
		String save = in.nextLine();
		if (save.equals("1") || save.equals("table") || save.equals("Table"))
		{
			Price = 250;
			choice = "table";
			error = false;
		}
		else if (save.equals("2") || save.equals("desk") || save.equals("Desk"))
		{
			Price = 325;
			choice = "desk";
			error = false;
		}
		else if (save.equals("3") || save.equals("dresser") || save.equals("Dresser"))
		{
			Price = 420;
			choice = "dresser";
			error = false;
		}
		else if (save.equals("4") || save.equals("entertainment center") || save.equals("Entertainment Center"))
		{
			Price = 600;
			choice = "entertainment center";
			error = false;
		}
		if(!error)
			System.out.println("You selected a(n) " + choice + " for $" + Price +".");
		else
		{
			System.err.println("At least one of the values you entered are invalid.");
		}
	}

}



	