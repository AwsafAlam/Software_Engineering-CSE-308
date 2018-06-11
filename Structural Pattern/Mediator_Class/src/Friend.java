abstract class Friend {
    protected Mediator mediator;
    public  String name;

    public Friend(Mediator _mediator){
        mediator = _mediator;
    }

    public abstract  void Send(String msg);
    public abstract  void Notify(String  msg);

}
