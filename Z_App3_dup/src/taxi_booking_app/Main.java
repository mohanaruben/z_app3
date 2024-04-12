package taxi_booking_app;



import java.util.Scanner;

public class Main 
{
	public static void main(String[] args) throws CloneNotSupportedException 
	{
		boolean loop = true;
		
		while(loop)
		{
			System.out.println("Choose any one\n1.Book Taxi\n2.Display Details\n3.Exit");
			Scanner s = new Scanner(System.in);
			int n = s.nextInt();
			
			switch(n)
			{
			case 1:
			{
				System.out.println("Enter Pickup Location");
				char pickupLocation = s.next().charAt(0);
				System.out.println("Enter Drop Location");
				char dropLocation = s.next().charAt(0);
				System.out.println("Enter Pickup Time");
				int pickupTime = s.nextInt();
				System.out.println(Taxi_booking_application.booking(pickupLocation, dropLocation, pickupTime));
				break;
			}
			
			case 2:
			{
				Taxi_booking_application.display();
				break;
			}
			
			case 3:
			{
				loop = false;
				System.out.println("\tThank You!!!");
				s.close();
				break;
			}
			}
		}
	}
}
