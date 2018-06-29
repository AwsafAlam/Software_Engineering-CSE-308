import java.util.Scanner;

public class AdapterPatternExecute{

	public static void main(String[] args) {


		ExternalDevice externalDevice = new ExternalDevice();

		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Insert External Device :");

			String DeviceName = sc.next();
			System.out.println("\nEnter Port Name\n");
			String Port = sc.next();

			externalDevice.Insert(DeviceName, Port);
		}
	}

}
