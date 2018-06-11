public class ConcreteMediator extends Mediator{

    private Friend1 friend1;
    private Friend2 friend2;
    private Boss boss;

    @Override
    public void Send(Friend frnd, String msg) {

        if (frnd == friend1){
            friend2.Notify(msg);
            boss.Notify(friend1.name +" send a msg to "+friend2.name);
        }
        if (frnd == friend2){
            friend1.Notify(msg);
            boss.Notify(friend2.name +" send a msg to "+friend1.name);
        }
        if (frnd == boss){
            friend1.Notify(msg);
            friend2.Notify(msg);
        }

    }

    public void setFriend1(Friend1 friend1) {
        this.friend1 = friend1;
    }

    public void setFriend2(Friend2 friend2) {
        this.friend2 = friend2;
    }

    public void setBoss(Boss boss) {
        this.boss = boss;
    }
}
