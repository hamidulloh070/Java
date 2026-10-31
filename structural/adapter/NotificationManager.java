package structural.adapter;

public class NotificationManager {
    private final NotificationService notificationService;

    public NotificationManager(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void notifyUser(String recipient, String message) {
        notificationService.send(recipient, message);
    }
}
