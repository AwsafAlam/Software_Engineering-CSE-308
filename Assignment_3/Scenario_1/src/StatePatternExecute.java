public class StatePatternExecute {

    public static void main(String[] args) {
//        System.out.println("Hello");

        Context context = new Context();

        StartState startState = new StartState();
        startState.doAction(context);

        System.out.println(context.getState().toString());

        StopState stopState = new StopState();
        stopState.doAction(context);
        System.out.println(context.getState().toString());

    }
}
