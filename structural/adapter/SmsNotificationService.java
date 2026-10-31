package structural.adapter;

public class SmsNotificationService implements NotificationService {
    @Override
    public void send(String recipient, String message) {
        System.out.println("SMS yuborildi [" + recipient + "]: " + message);
    }
}
