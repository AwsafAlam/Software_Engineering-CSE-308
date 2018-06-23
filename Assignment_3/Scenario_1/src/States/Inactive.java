package States;

import Coins.*;
import Drinks.SoftDrinks;

import java.util.Scanner;

public class Inactive implements State {

    VendingMachine vendingMachine;
    VendingInventory vendingInventory;

    public Inactive(State vendingMachine, VendingInventory inventory) {
        this.vendingMachine = (VendingMachine) vendingMachine;
        this.vendingInventory = inventory;
    }

    @Override
    public void showInventory() {
        vendingInventory.Show();
    }

    @Override
    public void itemSelect() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Press 1 : For Coca Cola\n" +
                "Press 2 : For SevenUp \n" +
                "Press 3: For Mountain dew\n" +
                "-------------------------------------\n");
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
        Scanner sc = new Scanner(System.in);
        if(vendingMachine.getProduct() == null){
            System.out.println("No items selected yet\n");
        }
        else{
            System.out.println("Please pay : "+vendingMachine.getProduct().Price()+"\n");
            System.out.println("This machine accepts BDT 50, BDT 20, BDT 10, BDT 5, BDT 2, BDT 1\n");
            int deposit = sc.nextInt();
            int numberofcoins = sc.nextInt();
            changeState(vendingMachine.getProduct() , deposit, numberofcoins);

        }

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
             vendingMachine.setChange(vendingMachine.getProduct().Price());
             vendingMachine.setCurrentState(vendingMachine.getNoProductduetoInsufficientCurrency());
             return;
         }
         deposit = deposit * numberofcoins;
        System.out.println("You have deposited total :"+deposit);
        System.out.println("\n");
        if (deposit < drink.Price()) {
            //vendingInventory.Add(drink);
            vendingMachine.setProduct(drink);
            vendingMachine.setChange(drink.Price() - deposit);
            vendingMachine.setCurrentState(vendingMachine.getNoProductduetoInsufficientCurrency());
        } else if (deposit > drink.Price()) {
            vendingMachine.setChange(deposit - drink.Price());
            vendingMachine.setProduct(drink);
            vendingMachine.setCurrentState(vendingMachine.getProductandChange());
        } else {
            vendingMachine.setProduct(drink);
            vendingMachine.setChange(0);
            vendingMachine.setCurrentState(vendingMachine.getProductandNoChange());
        }

    }

    @Override
    public void getOutput() {
        System.out.println("Vending Machine is currently Inactive. Please order some items\n");
    }
}
