//Observer pattern (publisher - subscriber )
public interface Subject 
{
    public void attach(Observer o);
    public void detach(Observer o);
    public void notifyUpdate(Message m);
}
public class MessagePublisher implements Subject {
    private List<Observer> observers = new ArrayList<>();
    public void attach(Observer o) {
        observers.add(o);
    }
    public void detach(Observer o) {
        observers.remove(o);
    }
    public void notifyUpdate(Message m) {
        for(Observer o: observers) {
            o.update(m);
        }
    }
}
public interface Observer 
{
    public void update(Message m);
}
public class MessageSubscriberOne implements Observer 
{
    public void update(Message m) {
        System.out.println("MessageSubscriberOne :: " + m.getMessageContent());
    }
}
public class MessageSubscriberTwo implements Observer 
{
    public void update(Message m) {
        System.out.println("MessageSubscriberTwo :: " + m.getMessageContent());
    }
}
public class MessageSubscriberThree implements Observer 
{
    public void update(Message m) {
        System.out.println("MessageSubscriberThree :: " + m.getMessageContent());
    }
}
public class Message 
{
    final String messageContent;
     
    public Message (String m) {
        this.messageContent = m;
    }
 
    public String getMessageContent() {
        return messageContent;
    }
}
public class Observer 
{
    public static void main(String[] args) 
    {
        MessageSubscriberOne s1 = new MessageSubscriberOne();
        MessageSubscriberTwo s2 = new MessageSubscriberTwo();
        MessageSubscriberThree s3 = new MessageSubscriberThree();
         
        MessagePublisher p = new MessagePublisher();
         
        p.attach(s1);
        p.attach(s2);
         
        p.notifyUpdate(new Message("First Message"));   //s1 and s2 will receive the update
         
        p.detach(s1);
        p.attach(s3);
         
        p.notifyUpdate(new Message("Second Message")); //s2 and s3 will receive the update
    }
}