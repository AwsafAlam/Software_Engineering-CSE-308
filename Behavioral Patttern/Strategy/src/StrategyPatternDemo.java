public class StrategyPatternDemo {
    public static void main(String[] args) {
        System.out.println("Hello");
        Context context = new Context(new OperationAdd());
        System.out.println("10 + 5 = "+context.executeStrategy(10 , 5));
    }
}
