public class Boss extends Friend {

//    private String name;

    public Boss(ConcreteMediator m, String name) {
        super(m);
        this.name = name;
    }

    @Override
    public void Send(String msg) {
        mediator.Send(this , msg);
    }

    @Override
    public void Notify(String msg) {
        System.out.println("\nBoss Sees msg : "+msg);
        System.out.println("");
    }


}
