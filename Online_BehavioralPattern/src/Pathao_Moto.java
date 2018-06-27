public class Pathao_Moto implements Strategy {
    @Override
    public double calculateCost(int d, int n, int t) {
        return 30 + d*11;
    }
}
