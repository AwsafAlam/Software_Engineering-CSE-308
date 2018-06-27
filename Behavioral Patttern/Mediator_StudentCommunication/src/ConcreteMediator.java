import java.util.ArrayList;
import java.util.List;

public class ConcreteMediator extends Mediator {

    private List<Student> studentlist = new ArrayList<>();
    private Class_Representative classRepresentative;

    @Override
    public void Send(Friend frnd, String msg) {
        for (Student std:studentlist) {
            std.Notify(msg);
        }
    }


    public void Subscribe(Student student) {
        studentlist.add(student);
    }
    public void UnSubscribe(Student student) {
        studentlist.remove(student);
    }

    public void setBoss(Class_Representative classRepresentative) {
        this.classRepresentative = classRepresentative;
    }


}
