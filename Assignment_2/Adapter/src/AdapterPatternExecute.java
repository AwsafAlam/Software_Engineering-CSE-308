import java.util.Scanner;

public class AdapterPatternExecute{

	public static void main(String[] args) {


		ExternalDevice externalDevice = new ExternalDevice();

		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Press 1 : To InsertDevice\n" +
					"Press 2: To remove Device\n");
			int choice = sc.nextInt();

			if(choice == 1){
				System.out.println("Insert External Device :");

				String DeviceName = sc.next();
				System.out.println("\nEnter Port Name\n");
				String Port = sc.next();

				externalDevice.Insert(DeviceName, Port);
			}
			else {
				System.out.println("Remove External Device :");

				String DeviceName = sc.next();
				System.out.println("\nEnter Port Name\n");
				String Port = sc.next();

				externalDevice.Remove(DeviceName, Port);
			}

		}
	}

}
