package structural.adapter;

public class EmailAdapter implements NotificationService {
    private static final String DEFAULT_SUBJECT = "Bildirishnoma";

    private final EmailClient emailClient;

    public EmailAdapter(EmailClient emailClient) {
        this.emailClient = emailClient;
    }

    @Override
    public void send(String recipient, String message) {
        emailClient.sendEmail(recipient, DEFAULT_SUBJECT, message);
    }
}
