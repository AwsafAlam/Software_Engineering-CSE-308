import java.util.Scanner;

public class Observer_PatternExecute {

    public static void main(String[] args) {

        ConcreteSubject concreteSubject = new ConcreteSubject();
        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.println("Press 1: to add new subscription\n" +
                                "Press 2: To unsubscribe\n" +
                                "Press 3: To send message\n" +
                                "---------------------------------");
            int choice = Integer.parseInt(sc.nextLine());
            if(choice == 1){
                System.out.println("Press 1 : To enroll new\n" +
                                   "Press 2 : To renew subscription\n" +
                        	   "-------------------------------\n");

                choice = Integer.parseInt(sc.nextLine());
                if(choice == 1){
                    ConcreteObserver st = new ConcreteObserver(concreteSubject);
                }
                else if(choice == 2){
                    System.out.println("Please Enter Student ID - ");
                    int ID = Integer.parseInt(sc.nextLine());
                    ConcreteObserver st = new ConcreteObserver(concreteSubject , ID);
                }
            }
            else if(choice == 2){
                System.out.println("Please Enter Student ID - ");
                int ID = Integer.parseInt(sc.nextLine());;
                concreteSubject.unsubscribe(ID);
            }
            else if(choice == 3){
                String msg = "";
                msg += sc.nextLine();

                concreteSubject.setMessage(msg);
                concreteSubject.notifyObserver();
            }
            else {
                System.out.println("Exiting Program .....");
                break;
            }
        }
    }
}
