public class Class_Representative extends Friend {

//    private String name;

    public Class_Representative(ConcreteMediator m, String name) {
        super(m);
        this.setName(name);
    }

    @Override
    public void Send(String msg) {
        mediator.Send(this , msg);
    }

    @Override
    public void Notify(String msg) {
        System.out.println("\nClass_Representative Sees msg : "+msg);
        System.out.println("");
    }


}
