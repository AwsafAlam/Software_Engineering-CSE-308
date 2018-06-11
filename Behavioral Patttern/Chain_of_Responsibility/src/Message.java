public class Message {
    public String Text;
    public MessagePriority Priority;
    public Message(String msg, MessagePriority Priority) {
        Text = msg;
        this.Priority = Priority;
    }
}
