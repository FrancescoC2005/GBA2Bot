import org.telegram.telegrambots.client.okhttp.OkHttpTelegramClient;
import org.telegram.telegrambots.longpolling.util.LongPollingSingleThreadUpdateConsumer;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.meta.generics.TelegramClient;

public class Bot implements LongPollingSingleThreadUpdateConsumer {
    private final TelegramClient telegramClient;

    public Bot(String botToken) {
        telegramClient = new OkHttpTelegramClient("7729315133:AAERJB00F4GPRoPLJYf91ZT6jVwSji_Ucqg");
    }

    @Override
    public void consume(Update update) {
        if (update.hasMessage() && update.getMessage().hasText()) {
            String message_text = update.getMessage().getText();
            long chat_id = update.getMessage().getChatId();
            if (message_text.equals("/start")) {
                // User send /start
                SendMessage message = SendMessage
                        .builder()
                        .chatId(chat_id)
                        .text(message_text)
                        .build();
                try {
                    telegramClient.execute(message); // Sending our message object to user
                } catch (TelegramApiException e) {
                    e.printStackTrace();
                }
            }
            else if (message_text.equals("/help")) {
                // User send /start
                SendMessage message = SendMessage
                        .builder()
                        .chatId(chat_id)
                        .text("The commands available are: /random, /select <character>, /find <character> <statistic>, /rank <character>, /showrank")
                        .build();
                try {
                    telegramClient.execute(message); // Sending our message object to user
                } catch (TelegramApiException e) {
                    e.printStackTrace();
                }
            }
            else if (message_text.equals("/random")) {
                // User send /start
                SendMessage message = SendMessage
                        .builder()
                        .chatId(chat_id)
                        .text("balls")
                        .build();
                try {
                    telegramClient.execute(message); // Sending our message object to user
                } catch (TelegramApiException e) {
                    e.printStackTrace();
                }
            }
            else if (message_text.equals("/help")) {
                // User send /start
                SendMessage message = SendMessage
                        .builder()
                        .chatId(chat_id)
                        .text("The commands available are: /random, /select <character>, /find <character> <statistic>, /rank <character>, /showrank")
                        .build();
                try {
                    telegramClient.execute(message); // Sending our message object to user
                } catch (TelegramApiException e) {
                    e.printStackTrace();
                }
            }

            else {
                // Unknown command
                SendMessage message = SendMessage // Create a message object object
                        .builder()
                        .chatId(chat_id)
                        .text("Unknown command")
                        .build();
                try {
                    telegramClient.execute(message); // Sending our message object to user
                } catch (TelegramApiException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}