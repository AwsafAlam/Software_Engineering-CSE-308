public class StopState implements  State {
    @Override
    public void doAction(Context context) {
        System.out.println("In start state ");
        context.setState(this);
    }

    public String  toString(){
        return "Stop State";
    }
}
