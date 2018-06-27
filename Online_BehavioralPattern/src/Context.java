public class Context {

    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public double calculateCost(int d, int n , int t) {

        return strategy.calculateCost(d,n , t);
    }
}
