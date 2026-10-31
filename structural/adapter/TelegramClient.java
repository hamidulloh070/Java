package structural.adapter;

class TelegramClient {
    public void sendTelegramMessage(String chatId, String text) {
        System.out.println("Telegram xabar yuborildi [Chat ID: " + chatId + "]: " + text);
    }
}
