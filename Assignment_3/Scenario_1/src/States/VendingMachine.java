package States;

import Drinks.SoftDrinks;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine implements State{

    private State inactive;
    private State productandNoChange;
    private State productandChange;
    private State noProductduetoInsufficientCurrency;
    private State noProductduetoInventoryDepletion;

    private State currentState;
    VendingInventory vendingInventory;
    int Change;
    SoftDrinks product;


    public VendingMachine(VendingInventory inventory){

      inactive = new Inactive(this, inventory);
      productandNoChange = new ProductandNoChange(this,inventory);
      productandChange = new ProductandChange(this , inventory);
      noProductduetoInsufficientCurrency = new NoProductduetoInsufficientCurrency(this , inventory);
      noProductduetoInventoryDepletion = new NoProductduetoInventoryDepletion(this , inventory);
      this.vendingInventory = inventory;
      currentState = inactive;
    }

    public SoftDrinks getProduct() {
        return product;
    }

    public void setProduct(SoftDrinks product) {
        this.product = product;
    }

    public State getCurrentState() {
        return currentState;
    }

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
    }

    public int getChange() {
        return Change;
    }

    public void setChange(int change) {
        this.Change = change;
    }

    public State getInactive() {
        return inactive;
    }

    public State getProductandNoChange() {
        return productandNoChange;
    }

    public State getProductandChange() {
        return productandChange;
    }

    public State getNoProductduetoInsufficientCurrency() {
        return noProductduetoInsufficientCurrency;
    }

    public State getNoProductduetoInventoryDepletion() {
        return noProductduetoInventoryDepletion;
    }

    @Override
    public void showInventory() {
        currentState.showInventory();
    }

    @Override
    public void itemSelect() {
        currentState.itemSelect();
    }

    @Override
    public void makeDeposit() { currentState.makeDeposit(); }


    @Override
    public void getOutput() {
        currentState.getOutput();
    }
}
