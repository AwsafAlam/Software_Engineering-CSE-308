import java.util.Scanner;

public class Rent_A_Vehicle {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int Seating = sc.nextInt();
        String Aircond = sc.next();

        String tools = sc.next();

        VehicleFactory vehicleFactory = new VehicleFactory();

        Vehicle myvehicle = vehicleFactory.getVehicle(Seating , Aircond , tools);

        myvehicle.showPrice();

        System.out.println("Make your payment :");
        int amount = sc.nextInt();

        if(myvehicle.matchPrice(amount)){
            System.out.println("Payment complete");
        }
        else{
            System.out.println("Please pay the correct amount");
        }




    }
}
