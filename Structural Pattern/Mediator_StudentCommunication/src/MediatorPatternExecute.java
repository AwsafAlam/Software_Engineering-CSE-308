import java.util.Scanner;

public class MediatorPatternExecute {


    public static void main(String[] args) {


        ConcreteMediator m = new ConcreteMediator();

        Student Niloy = new Student(m , "Niloy");
        Student Mushfiq = new Student(m , "Mushfiq");

        Class_Representative CR = new Class_Representative(m , "Shommo");

        m.Subscribe(Mushfiq);
//        m.UnSubscribe(Mushfiq);

        m.Subscribe(Niloy);

        m.setBoss(CR);

        Scanner sc = new Scanner(System.in);

        while (true){

            System.out.println("Press :1 to change subscription \n" +
                                "Press :2 to send message\n" +
                                "Press :0 to exit");
            int option = Integer.parseInt(sc.nextLine());

            if(option == 1){
                // Create a login or signup
            }
            else if(option == 2){
                String msg = "";
                msg += sc.nextLine();
                CR.Send(msg);
            }
            else {
                break;
            }

        }




    }
}
