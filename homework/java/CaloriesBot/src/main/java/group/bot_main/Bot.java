package group.bot_main;

import org.telegram.telegrambots.ApiContextInitializer;
import org.telegram.telegrambots.TelegramBotsApi;
import org.telegram.telegrambots.api.objects.Update;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.exceptions.TelegramApiRequestException;

public class Bot extends TelegramLongPollingBot {

    public static void main(String[] args) {
        ApiContextInitializer.init();
        TelegramBotsApi tBotApi = new TelegramBotsApi();

        try {
            tBotApi.registerBot(new Bot());
        }
        catch (TelegramApiRequestException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onUpdateReceived(Update update) {
        // Responding to user commands
    }

    @Override
    public String getBotUsername() {
        return "Monitor food consumption";
    }

    @Override
    public String getBotToken() {
        return "1681151715:AAFBNAunIs-VaF2fMi6plaAg-Kl0zsvC1ZY";
    }
}
