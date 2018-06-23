package States;

import Coins.Coin;
import Drinks.SoftDrinks;

import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;

public class ProductandChange implements State {
    VendingMachine vendingMachine;
    VendingInventory vendingInventory;

    public ProductandChange(State vendingMachine, VendingInventory inventory) {
        this.vendingMachine = (VendingMachine) vendingMachine;
        vendingInventory = inventory;
    }

    @Override
    public void showInventory() {
        vendingInventory.Show();

    }

    @Override
    public void itemSelect() {
        System.out.println("Please collect previously purchased product "+vendingMachine.getProduct().Name()+"\n");
    }

    @Override
    public void makeDeposit() {
        System.out.println("No need to make any further deposit. Your product "+vendingMachine.getProduct().Name()+" is ready.\n");
    }


    @Override
    public void getOutput() {

        int change = vendingMachine.getChange();
        ArrayList<Coin> changelist = new ArrayList<>();

        while(change > 0){

           while(vendingInventory.getNumberOftaka50() > 0 && change >= 50){
               vendingInventory.setNumberOftaka50(vendingInventory.getNumberOftaka50()-1);
               changelist.add(vendingInventory.RemoveCoin(50));
               change -= 50;
           }
            while(vendingInventory.getNumberOftaka20() > 0 && change >= 20){
                vendingInventory.setNumberOftaka20(vendingInventory.getNumberOftaka20()-1);
                changelist.add(vendingInventory.RemoveCoin(20));
                change -= 20;
            }
            while(vendingInventory.getNumberOftaka10() > 0 && change >= 10){
                vendingInventory.setNumberOftaka10(vendingInventory.getNumberOftaka10()-1);
                changelist.add(vendingInventory.RemoveCoin(10));
                change -= 10;
            }
            while(vendingInventory.getNumberOftaka5() > 0 && change >= 5){
                vendingInventory.setNumberOftaka5(vendingInventory.getNumberOftaka5()-1);
                changelist.add(vendingInventory.RemoveCoin(5));
                change -= 5;
            }
            while(vendingInventory.getNumberOftaka2() > 0 && change >= 2){
                vendingInventory.setNumberOftaka2(vendingInventory.getNumberOftaka2()-1);
                changelist.add(vendingInventory.RemoveCoin(2));
                change -= 2;
            }
            while(vendingInventory.getNumberOftaka1() > 0 && change >= 1){
                vendingInventory.setNumberOftaka1(vendingInventory.getNumberOftaka1()-1);
                changelist.add(vendingInventory.RemoveCoin(1));
                change -= 1;
            }

        }

        System.out.println("One "+vendingMachine.getProduct().Name() + "\nPrice : " +
                vendingMachine.getProduct().Price()+ "\nChange : "+vendingMachine.getChange());
        for (Coin c: changelist) {
            System.out.println(c.Name());
        }
        System.out.println("----------------------------------");
        vendingMachine.setChange(0);
        vendingMachine.setProduct(null);
        vendingMachine.setCurrentState(vendingMachine.getInactive());
        //vendingMachine.showInventory();
    }
}
