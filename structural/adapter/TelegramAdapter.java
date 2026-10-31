package structural.adapter;

public class TelegramAdapter implements NotificationService {
    private final TelegramClient telegramClient;

    public TelegramAdapter(TelegramClient telegramClient) {
        this.telegramClient = telegramClient;
    }

    @Override
    public void send(String recipient, String message) {
        telegramClient.sendTelegramMessage(recipient, message);
    }
}
