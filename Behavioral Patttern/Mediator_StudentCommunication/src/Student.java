public class Student extends Friend{

    public Student(ConcreteMediator m, String name) {
        super(m);
        this.setName(name);
    }


    @Override
    public void Send(String msg) {
        mediator.Send(this , msg);
    }

    @Override
    public void Notify(String msg) {
        System.out.println(this.getName() +" received message : "+msg);
        System.out.println("");
    }

}
