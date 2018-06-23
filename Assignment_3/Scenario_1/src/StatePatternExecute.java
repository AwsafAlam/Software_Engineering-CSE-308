import States.VendingInventory;
import States.VendingMachine;

import java.util.Scanner;

public class StatePatternExecute {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        VendingInventory inventory = new VendingInventory(10, 10 , 10);
        VendingMachine vendingMachine = new VendingMachine(inventory);

        while (true){

            System.out.println("Press 1: To view Inventory\n" +
                    "Press 2: To select Item from Inventory\n" +
                    "Press 3: To deposit cash\n" +
                    "Press 4: To get your drink\n" +
                    "Press 0 to exit program\n" +
                    "--------------------------------------");
            int choice = sc.nextInt();

            if(choice == 1){
                vendingMachine.showInventory();
            }
            else if(choice == 2){
                vendingMachine.itemSelect();
            }
            else if(choice == 3){
                vendingMachine.makeDeposit();
            }
            else if(choice == 4){
                vendingMachine.getOutput();
            }
            else{
                System.out.println("Exiting Program ...");
                break;
            }

        }

    }
}
