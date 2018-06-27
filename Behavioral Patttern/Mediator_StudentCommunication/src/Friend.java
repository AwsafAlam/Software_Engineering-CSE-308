abstract class Friend {
    protected Mediator mediator;
    private  String name;

    public Friend(Mediator _mediator){
        mediator = _mediator;
    }

    public abstract  void Send(String msg);
    public abstract  void Notify(String  msg);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
