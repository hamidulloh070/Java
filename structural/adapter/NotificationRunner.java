package structural.adapter;

public class NotificationRunner {
    public static void main(String[] args) {
        NotificationService smsService = new SmsNotificationService();
        NotificationManager smsManager = new NotificationManager(smsService);
        smsManager.notifyUser("+998901234567", "Sizning tasdiqlash kodingiz: 1234");

        System.out.println("--------------------------------------------------");

        TelegramClient telegramClient = new TelegramClient();
        NotificationService telegramAdapter = new TelegramAdapter(telegramClient);
        NotificationManager telegramManager = new NotificationManager(telegramAdapter);
        telegramManager.notifyUser("hamidulloh_070", "Assalomu alaykum, yangi vazifa yuklandi!");

        System.out.println("--------------------------------------------------");

        EmailClient emailClient = new EmailClient();
        NotificationService emailAdapter = new EmailAdapter(emailClient);
        NotificationManager emailManager = new NotificationManager(emailAdapter);
        emailManager.notifyUser(
                "user@gmail.com",
                "Tabriklaymiz, loyihangiz muvaffaqiyatli yakunlandi!");
    }
}
