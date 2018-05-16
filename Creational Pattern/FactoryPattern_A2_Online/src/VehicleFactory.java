public class VehicleFactory {

    public Vehicle getVehicle(int seating, String aircond, String tools) {

        if(seating == 0){
            return null;
        }
        if(seating >= 5 && seating <= 14){
            return new Micro();
        }
        else if(seating > 14){
            System.out.println("You cannot fit so many people sorry..");
            return new Micro();
        }
        else {
            return new PrivateCar();
        }


    }


}
