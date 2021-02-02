package by.alexandrR.TelegramBot.service;

import org.springframework.stereotype.Service;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;

@Service
public class MessageService {
    public SendMessage onUpdateReceived(Update update) {
        SendMessage sendMessage = new SendMessage();
        if(update != null){
            Message message = update.getMessage();
            sendMessage.setChatId(message.getChatId());
            if(message != null && message.hasText()){
                String magText = message.getText();
                if (magText.equalsIgnoreCase("/start")){
                    return sendMessage.setText("Приветствую, друг");
                } else if (magText.equalsIgnoreCase("/settings")){
                    return sendMessage.setText("Что нужно настроить?");
                }else  if (magText.equalsIgnoreCase("/help")){
                    return sendMessage.setText("Нужна моя помощь? Я готов помочь!");
                }else if (magText.equalsIgnoreCase("Расскажи мне что-нибудь")) {
                    return sendMessage.setText("Тебе рассказать о себе, или может быть о создании мира?");
                } else if (magText.equalsIgnoreCase("Кто тебя создал?")) {
                    return sendMessage.setText("Меня создал самый великий программер. Тот, чьё имя нельзя называть! :0");
                }
            }
        }
        return sendMessage.setText("Сейчас я тебя не понимаю. Напиши /start, /settings, /help либо задай правильный вопрос");
    }
}
