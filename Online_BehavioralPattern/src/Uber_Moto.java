public class Uber_Moto implements Strategy {
    @Override
    public double calculateCost(int d, int n, int t) {
        return 25 + d*12;
    }
}
