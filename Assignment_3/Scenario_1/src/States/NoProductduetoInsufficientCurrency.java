package States;

import Coins.*;
import Drinks.SoftDrinks;

import java.util.Scanner;

public class NoProductduetoInsufficientCurrency implements State {
    VendingMachine vendingMachine;
    VendingInventory vendingInventory;

    public NoProductduetoInsufficientCurrency(State vendingMachine, VendingInventory inventory) {
        this.vendingMachine = (VendingMachine) vendingMachine;
        vendingInventory = inventory;
    }


    @Override
    public void showInventory() {
        vendingInventory.Show();
    }

    @Override
    public void itemSelect() {
        System.out.println("You have already selected "+vendingMachine.getProduct().Name()
        +" please pay BDT "+vendingMachine.getChange()+" before selecting another product.\n");
    }

    @Override
    public void makeDeposit() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please pay : "+vendingMachine.getChange()+"\n");
        System.out.println("This machine accepts BDT 50, BDT 20, BDT 10, BDT 5, BDT 2, BDT 1\n");

        int deposit = sc.nextInt();
        int numberofcoins = sc.nextInt();
        //System.out.println("No product due to in sufficient currency");

        changeState(vendingMachine.getProduct() , deposit, numberofcoins);
    }


    private void changeState(SoftDrinks drink, int deposit, int numberofcoins){

        if(deposit == 1){
            for(int i=0 ; i< numberofcoins; i++){
                vendingInventory.AddCoin(new Taka1());
            }
        }
        else if(deposit == 2){
            for(int i=0 ; i< numberofcoins; i++){
                vendingInventory.AddCoin(new Taka2());
            }
        }
        else if(deposit == 5){
            for(int i=0 ; i< numberofcoins; i++){
                vendingInventory.AddCoin(new Taka5());
            }
        }
        else if(deposit == 10){
            for(int i=0 ; i< numberofcoins; i++){
                vendingInventory.AddCoin(new Taka10());
            }
        }
        else if(deposit == 20){
            for(int i=0 ; i< numberofcoins; i++){
                vendingInventory.AddCoin(new Taka20());
            }
        }
        else if(deposit == 50){
            for(int i=0 ; i< numberofcoins; i++){
                vendingInventory.AddCoin(new Taka50());
            }
        }
        else{
            System.out.println("Coin Not recognised by machine please try again\n");
            return;
            //this.makeDeposit();
        }

        deposit = deposit * numberofcoins;

        if (deposit < vendingMachine.getChange()) {
            //vendingInventory.Add(drink);
            //vendingMachine.setCurrentState(vendingMachine.getNoProductduetoInsufficientCurrency());
            vendingMachine.setChange(vendingMachine.getChange() - deposit);
            this.getOutput();
        } else if (deposit > vendingMachine.getChange()) {
            vendingMachine.setChange(deposit - vendingMachine.getChange());
            vendingMachine.setProduct(drink);
            vendingMachine.setCurrentState(vendingMachine.getProductandChange());
            System.out.println("Payment Complete. Please collect your product from vending machine\n");
            //vendingMachine.getOutput();
        } else {
            vendingMachine.setProduct(drink);
            vendingMachine.setChange(0);
            vendingMachine.setCurrentState(vendingMachine.getProductandNoChange());
            System.out.println("Payment Complete. Please collect your product from vending machine\n");
            //vendingMachine.getOutput();
        }

    }


    @Override
    public void getOutput() {
        System.out.println("One "+vendingMachine.getProduct().Name() + "\n Price : " +
                vendingMachine.getProduct().Price()+ "\nPlease Insert BDT "+vendingMachine.getChange()+
        " to buy this drink.\n");
        //vendingMachine.setCurrentState(vendingMachine.getCurrentState());
        //this.makeDeposit();
    }
}
