package States;

public class ProductandNoChange implements State {
    VendingMachine vendingMachine;
    VendingInventory vendingInventory;

    public ProductandNoChange(State vendingMachine, VendingInventory inventory) {
        this.vendingMachine = (VendingMachine) vendingMachine;
        this.vendingInventory = inventory;
    }

    @Override
    public void showInventory() {
        vendingInventory.Show();
    }

    @Override
    public void itemSelect() {
        System.out.println("Please collect previously purchased "+vendingMachine.getProduct().Name()+"\n");
    }

    @Override
    public void makeDeposit() {
        System.out.println("No need to make any further deposit. Your product "+vendingMachine.getProduct().Name()+" is ready.\n");
    }

    @Override
    public void getOutput() {
        System.out.println("One "+vendingMachine.getProduct().Name() + "\n Price : " +
                vendingMachine.getProduct().Price()+ "\nChange : "+vendingMachine.getChange());
        vendingMachine.setProduct(null);
        vendingMachine.setCurrentState(vendingMachine.getInactive());
    }
}
