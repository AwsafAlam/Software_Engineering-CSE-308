
public class ChainOfResponsibilityPatternExecute {


    public static void main(String[] args) {
        System.out.println("Hello World");

        //Start chain
        IReceiver faxHandler, emailHandler;
        //end of chain

        emailHandler= new EmailHandler(null);

        faxHandler = new FaxHandler(emailHandler);

        IssueRaiser raiser = new IssueRaiser(faxHandler);

        Message m1 = new Message("Fax is reaching late", MessagePriority.Normal);
        Message m2 = new Message("Email is not going", MessagePriority.High);
        Message m3 = new Message("Fax is reaching late", MessagePriority.Normal);
        Message m4 = new Message("Fax is not reaching destination", MessagePriority.High);

        raiser.RaiseMessage(m1);
        raiser.RaiseMessage(m2);
        raiser.RaiseMessage(m3);
        raiser.RaiseMessage(m4);

    }
}
