import Accessories.*;

import java.util.Scanner;

public class AccessoryDecorator extends BikeDecorator {

    public AccessoryDecorator(Bike decorateshape) {
        super(decorateshape);
        Price = 0;
    }
    int Price;

    @Override
    public int price() {
        return decorateBike.price()+Price;
    }


    @Override
    public void buy() {

        Scanner sc = new Scanner(System.in);

        String  acc[] = new String[3];
        System.out.print("Do you want horn? [y/n]: ");
        acc[0] = sc.next();
        System.out.print("Do you want basket? [y/n]: ");
        acc[1] = sc.next();
        System.out.print("Do you want lights? [y/n]: ");
        acc[2] = sc.next();


        if(acc[0].equalsIgnoreCase("y")){
            addhorn();
        }
        if(acc[1].equalsIgnoreCase("y")){
            addbasket();
        }
        if(acc[2].equalsIgnoreCase("y")){
            System.out.println("1. Front Light Only\n" +
                    "2. Back Light Only\n" +
                    "3. Both Front and Back Light\n");
            int light  = sc.nextInt();
            if(light == 1){
                addFrontLight();
            }
            else if(light == 2){
                addBackLight();
            }
            else if(light == 3){
                addFrontLight();
                addBackLight();
            }
            else{
                System.out.println("Please enter valid choice\n");
            }

        }

        decorateBike.buy();

    }

    private void addBackLight() {
         Price += new Back_Light().Price();
    }

    private void addFrontLight() {
        Price += new Front_Light().Price();
    }


    private void addbasket() {
        Price += new Basket().Price();
    }

    private void addhorn() {
        Price+= new Horn().Price();
    }


}
