import java.util.Scanner;

public class Execute {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.println("1. Buy a bike\n" +
                    "2. Exit\n");

            int choice = sc.nextInt();
            if(choice == 1){
                System.out.println("1. Buy Fixed Gear Bike\n" +
                        "2. Buy Road Bike\n" +
                        "3. Buy Hybrid Bike\n" +
                        "4. Buy Mountain Bike\n");
                int buy = sc.nextInt();
                if(buy == 1){

                    Bike fixedgear = new AccessoryDecorator(new Fixed_Gear_Bike());
                    fixedgear.buy();
                    System.out.println(fixedgear.price());

                }
                else if(buy == 2){
                    Bike roadbike = new AccessoryDecorator(new Fixed_Gear_Bike());
                    roadbike.buy();
                    System.out.println(roadbike.price());

                }
                else if(buy == 3){

                    Bike hybrid = new AccessoryDecorator(new Fixed_Gear_Bike());

                    hybrid.buy();
                    System.out.println(hybrid.price());

                }
                else if(buy == 4){

                    Bike mountainbike = new AccessoryDecorator(new Fixed_Gear_Bike());
                    mountainbike.buy();
                    System.out.println(mountainbike.price());

                }
                else{
                    System.out.println("Please Enter Valid input\n");
                }
            }
            else{
                break;
            }

        }

    }
}
