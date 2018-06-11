public class FaxHandler implements IReceiver {

    private IReceiver nextReceiver;
    public FaxHandler(IReceiver iReceiver) {
        nextReceiver = iReceiver;
    }

    @Override
    public boolean ProcessMessage(Message msg) {
        if(msg.Text.contains("Fax")){
            System.out.println("FaxErrorHandler processed "+msg.Priority
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
