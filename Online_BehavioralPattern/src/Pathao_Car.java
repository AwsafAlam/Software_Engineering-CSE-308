public class Pathao_Car implements Strategy {

    private static double Extremely_Peak =  1.5;
    private static double Moderately_Peak =  1.15;
    private static double Off_Peak =  0.9;


    @Override
    public double calculateCost(int d, int n, int t) {
        if(t == 1){
            return (n*d*18*Extremely_Peak);
        }
        else if(t == 2){
            return (n*d*18*Moderately_Peak);
        }
        else if( t == 3){
            return (n*d*18*Off_Peak);
        }
        else {
            System.out.println("Invalid Time Factor ...");
        }
        return 0;
    }
}
