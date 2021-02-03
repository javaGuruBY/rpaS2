package by.jrr.telegrambot.service;

import org.springframework.stereotype.Service;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;


@Service
public class MessageService {
    public SendMessage onUpdateReceived(Update update) {
        SendMessage sendMessage = new SendMessage();
        if (update != null) {
            Message message = update.getMessage();
            sendMessage.setChatId(467842524L);
            if (message != null && message.hasText()) {
                String messageText = message.getText();
                if (messageText.equals("/start")) {
                    return sendMessage.setText("Hello!");
                } else if (messageText.equals("/settings")) {
                    return sendMessage.setText("Settings!");
                } else if (messageText.equals("/help")) {
                    return sendMessage.setText("Help!");
                }
            }
        }
        return sendMessage.setText("Do no!");
    }
}
