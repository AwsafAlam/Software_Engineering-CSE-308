public class IssueRaiser {
    public IReceiver setFirstReceiver;
    public IssueRaiser(IReceiver iReceiver) {
        setFirstReceiver = iReceiver;
    }

    public void RaiseMessage(Message m) {
        if(setFirstReceiver != null){
            setFirstReceiver.ProcessMessage(m);
        }
    }
}
