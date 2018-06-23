package States;

import Drinks.SoftDrinks;

import java.util.Scanner;

public class NoProductduetoInventoryDepletion implements State {
    VendingMachine vendingMachine;
    VendingInventory vendingInventory;

    public NoProductduetoInventoryDepletion(State vendingMachine, VendingInventory inventory) {
        this.vendingMachine = (VendingMachine) vendingMachine;
        this.vendingInventory = inventory;
    }


    @Override
    public void showInventory() {
        vendingInventory.Show();
    }

    @Override
    public void itemSelect() {
        System.out.println("Press 1 : For Coca Cola\n" +
                "Press 2 : For SevenUp \n" +
                "Press 3: For Mountain dew\n" +
                "-------------------------------------\n");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();

        if(choice == 1){
            if(vendingInventory.getNumberOfCocaCola() > 0){
                SoftDrinks coke =  vendingInventory.getDrink(choice);
                vendingMachine.setProduct(coke);
                vendingMachine.setChange(coke.Price());
                System.out.println("Please pay BDT "+vendingMachine.getChange()+" to get your "+vendingMachine.getProduct().Name()+"\n");
                //this.makeDeposit();
                vendingMachine.setCurrentState(vendingMachine.getNoProductduetoInsufficientCurrency());
            }
            else {
                System.out.println("Sorry Coca Cola is out of stock. Please choose another product\n");
                vendingMachine.setCurrentState(vendingMachine.getNoProductduetoInventoryDepletion());
            }

        }
        else if(choice == 2) {
            if (vendingInventory.getNumberOfSevenUP() > 0) {
                SoftDrinks sevenup = vendingInventory.getDrink(choice);
                vendingMachine.setProduct(sevenup);
                vendingMachine.setChange(sevenup.Price());
                System.out.println("Please pay BDT "+vendingMachine.getChange()+" to get your "+vendingMachine.getProduct().Name()+"\n");
                vendingMachine.setCurrentState(vendingMachine.getNoProductduetoInsufficientCurrency());
                //this.makeDeposit();
            }
            else {
                System.out.println("Sorry Seven Up is out of stock. Please choose another product\n");
                vendingMachine.setCurrentState(vendingMachine.getNoProductduetoInventoryDepletion());
            }
        }
        else if(choice == 3){
            if (vendingInventory.getNumberOfMountainDew() > 0) {
                SoftDrinks dew = vendingInventory.getDrink(choice);
                vendingMachine.setProduct(dew);
                vendingMachine.setChange(dew.Price());
                System.out.println("Please pay BDT "+vendingMachine.getChange()+" to get your "+vendingMachine.getProduct().Name()+"\n");
                vendingMachine.setCurrentState(vendingMachine.getNoProductduetoInsufficientCurrency());
                //this.makeDeposit();
            }
            else {
                System.out.println("Sorry Mountain Dew is out of stock. Please choose another product\n");
                vendingMachine.setCurrentState(vendingMachine.getNoProductduetoInventoryDepletion());
            }
        }
    }

    @Override
    public void makeDeposit() {
        System.out.println("Please select product before making a deposit\n");
        vendingMachine.setCurrentState(vendingMachine.getInactive());
    }

    @Override
    public void getOutput() {
        System.out.println("One "+vendingMachine.getProduct().Name() + "\n Price : " +
                vendingMachine.getProduct().Price()+ "\nChange : "+vendingMachine.getChange()+"\n");
        vendingMachine.setCurrentState(vendingMachine.getInactive());
    }
}
