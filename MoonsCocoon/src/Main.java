import org.telegram.telegrambots.longpolling.TelegramBotsLongPollingApplication;

public static void main(String[] args) {
    String botToken = "12345:YOUR_TOKEN";
    // Using try-with-resources to allow autoclose to run upon finishing
    try (TelegramBotsLongPollingApplication botsApplication = new TelegramBotsLongPollingApplication()) {
        botsApplication.registerBot(botToken, new Bot(botToken));
        System.out.println("MyAmazingBot successfully started!");
        // Ensure this prcess wait forever
        Thread.currentThread().join();
    } catch (Exception e) {
        e.printStackTrace();
    }
}
