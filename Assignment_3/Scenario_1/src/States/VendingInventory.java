package States;

import Coins.*;
import Drinks.CocaCola;
import Drinks.MountainDew;
import Drinks.SevenUp;
import Drinks.SoftDrinks;

import java.util.ArrayList;
import java.util.List;

public class VendingInventory {

    private List<SoftDrinks> softDrinksList;
    private List<Coin> coinList;

    private int NumberOfCocaCola;
    private int NumberOfSevenUP;
    private int NumberOfMountainDew;

    private int NumberOftaka1;
    private int NumberOftaka2;
    private int NumberOftaka5;
    private int NumberOftaka10;
    private int NumberOftaka20;
    private int NumberOftaka50;

    public VendingInventory(int coke, int sevenup, int mountaindew) {
        softDrinksList = new ArrayList<>();
        coinList = new ArrayList<>();

        for(int i =0 ; i< 20 ; i++){
            coinList.add(new Taka1());
            coinList.add(new Taka2());
            coinList.add(new Taka5());
            coinList.add(new Taka10());
            coinList.add(new Taka20());
            coinList.add(new Taka50());
        }

        for(int i=0 ; i<coke ; i++){
            softDrinksList.add(new CocaCola());
        }
        for(int i=0 ; i<sevenup ; i++){
            softDrinksList.add(new SevenUp());
        }
        for(int i=0 ; i<mountaindew ; i++){
            softDrinksList.add(new MountainDew());
        }
        setNumberOfCocaCola(coke);
        setNumberOfSevenUP(sevenup);
        setNumberOfMountainDew(mountaindew);
        setNumberOftaka1(50);
        setNumberOftaka2(20);
        setNumberOftaka5(20);
        setNumberOftaka20(20);
        setNumberOftaka10(20);
        setNumberOftaka50(20);

    }

    public void AddCoin(Coin coin){
        coinList.add(coin);
    }

    public Coin RemoveCoin(int coin){
        int i =0;
        for (Coin c:coinList) {
            if(coin == 1){
                if(c instanceof Taka1){
                    i= coinList.indexOf(c);
                    Coin d = coinList.get(i);
                    coinList.remove(c);
                    return d;
                }
            }
            else if(coin == 2){
                if(c instanceof Taka2){
                    i= coinList.indexOf(c);
                    Coin d = coinList.get(i);
                    coinList.remove(c);
                    return d;
                }
            }
            else if(coin == 5){
                if(c instanceof Taka5){
                    i= coinList.indexOf(c);
                    Coin d = coinList.get(i);
                    coinList.remove(c);
                    return d;
                }
            }
            else if(coin == 10){
                if(c instanceof Taka10){
                    i= coinList.indexOf(c);
                    Coin d = coinList.get(i);
                    coinList.remove(c);
                    return d;
                }
            }
            else if(coin == 20){
                if(c instanceof Taka20){
                    i= coinList.indexOf(c);
                    Coin d = coinList.get(i);
                    coinList.remove(c);
                    return d;
                }
            }
            else if(coin == 50){
                if(c instanceof Taka50){
                    i= coinList.indexOf(c);
                    Coin d = coinList.get(i);
                    coinList.remove(c);
                    return d;
                }
            }

        }
        return null;
    }

    public SoftDrinks getDrink(int drink){
        int i = 0;
        for (SoftDrinks s:softDrinksList) {
            if(drink == 1){
                if(s instanceof CocaCola){
                    i= softDrinksList.indexOf(s);
                    SoftDrinks d = softDrinksList.get(i);
                    //System.out.println("Got drinks "+i);
                    softDrinksList.remove(s);
                    setNumberOfCocaCola(getNumberOfCocaCola()-1);
                    return d;
                }
            }
            else if(drink == 2){
                if(s instanceof SevenUp){
                    i= softDrinksList.indexOf(s);
                    SoftDrinks d = softDrinksList.get(i);
                    //System.out.println("Got drinks "+i);
                    softDrinksList.remove(s);
                    setNumberOfSevenUP(getNumberOfSevenUP()-1);
                    return d;
                }
            }
            else if(drink == 3){
                if(s instanceof MountainDew){
                    i= softDrinksList.indexOf(s);
                    SoftDrinks d = softDrinksList.get(i);
                    //System.out.println("Got drinks "+i);
                    softDrinksList.remove(s);
                    setNumberOfMountainDew(getNumberOfMountainDew()-1);
                    return d;
                }
            }

        }
        return null;
    }

    public void Show(){

        System.out.println("---------------------------------\n" +
        "\nCocacola "+getNumberOfCocaCola() + " available at BDT " +CocaCola.getPrice()+
        "\nSevenUp "+getNumberOfSevenUP()+" available at BDT " +SevenUp.getPrice()+
        "\nMountain Dew "+getNumberOfMountainDew()+" available at BDT " +MountainDew.getPrice()+
        "\n ---------------------------------\n");

    }


    public int getNumberOfCocaCola() {
        return NumberOfCocaCola;
    }

    public void setNumberOfCocaCola(int numberOfCocaCola) {
        NumberOfCocaCola = numberOfCocaCola;
    }

    public int getNumberOfSevenUP() {
        return NumberOfSevenUP;
    }

    public void setNumberOfSevenUP(int numberOfSevenUP) {
        NumberOfSevenUP = numberOfSevenUP;
    }

    public int getNumberOfMountainDew() {
        return NumberOfMountainDew;
    }

    public void setNumberOfMountainDew(int numberOfMountainDew) {
        NumberOfMountainDew = numberOfMountainDew;
    }

    public int getNumberOftaka1() {
        return NumberOftaka1;
    }

    public void setNumberOftaka1(int numberOftaka1) {
        NumberOftaka1 = numberOftaka1;
    }

    public int getNumberOftaka2() {
        return NumberOftaka2;
    }

    public void setNumberOftaka2(int numberOftaka2) {
        NumberOftaka2 = numberOftaka2;
    }

    public int getNumberOftaka5() {
        return NumberOftaka5;
    }

    public void setNumberOftaka5(int numberOftaka5) {
        NumberOftaka5 = numberOftaka5;
    }

    public int getNumberOftaka10() {
        return NumberOftaka10;
    }

    public void setNumberOftaka10(int numberOftaka10) {
        NumberOftaka10 = numberOftaka10;
    }

    public int getNumberOftaka20() {
        return NumberOftaka20;
    }

    public void setNumberOftaka20(int numberOftaka20) {
        NumberOftaka20 = numberOftaka20;
    }

    public int getNumberOftaka50() {
        return NumberOftaka50;
    }

    public void setNumberOftaka50(int numberOftaka50) {
        NumberOftaka50 = numberOftaka50;
    }



}
