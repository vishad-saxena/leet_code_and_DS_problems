class NotificationContent {
    int a;
    int b;
    public NotificationContent(int a, int b) {
        this.a = a;
        this.b = b;
    }
}
class NotificationError{

}
interface Executor1{
    void execute(int a, int b);
}
 abstract class NotificationExecutor<T extends NotificationContent,E extends NotificationError> implements Executor1{
     @Override
     public void execute(int a, int b) {
         getContent(a,b);
     }
     public abstract T getContent(int a,int b);
 }
class EmailContent extends NotificationContent{

    public EmailContent(int a, int b) {
        super(a, b);
        System.out.println("EMAIL content");
    }
}
class SMSContent extends NotificationContent{

    public SMSContent(int a, int b) {
        super(a, b);
        System.out.println("SMS content");
    }
}


class EmailExecutor extends NotificationExecutor<EmailContent,NotificationError> {

    @Override
    public EmailContent getContent(int a, int b) {
        return new EmailContent(a,b);
    }
}
class SMSExecutor extends NotificationExecutor<SMSContent,NotificationError> {

    @Override
    public SMSContent getContent(int a, int b) {
        return new SMSContent(a,b);
    }
}

public class DynamicPolymorphism {
    public static void main(String[] args) {

    }
}
