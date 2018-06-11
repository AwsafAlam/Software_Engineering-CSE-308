public class EmailHandler implements IReceiver {
    private IReceiver nextReceiver;

    public EmailHandler(IReceiver iReceiver) {
        nextReceiver = iReceiver;
    }

    @Override
    public boolean ProcessMessage(Message msg) {
        if(msg.Text.contains("Email")){
            System.out.println("EmailHandlerError processed "+msg.Priority
                    +" priority issue :"+msg.Text);
            return true;
        }
        else{
            if(nextReceiver!= null)
                nextReceiver.ProcessMessage(msg);
        }
        return false;
    }
}
