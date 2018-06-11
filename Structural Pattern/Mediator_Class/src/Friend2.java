public class Friend2 extends Friend{
    public Friend2(ConcreteMediator m, String name) {
        super(m);
        this.name = name;
    }


    @Override
    public void Send(String msg) {
        mediator.Send(this , msg);
    }

    @Override
    public void Notify(String msg) {
        System.out.println(this.name +" received message : "+msg);
        System.out.println("");
    }

}
