package by.bpv.telegrambot.service;
import org.springframework.stereotype.Service;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;

@Service
public class MessageService {
    public SendMessage onUpdateReceived(Update update){
        SendMessage sendMessage = new SendMessage();
        if(update != null){
            Message message = update.getMessage();
            sendMessage.setChatId(message.getChatId());
            if(message != null && message.hasText()){
                String messText = message.getText();
                if(messText.equals("/start")){
                    return sendMessage.setText("Hello, my friend");
                }
                else if(messText.equals("/help")){
                    return sendMessage.setText("Help");
                }
                else if(messText.equals("/setting")){
                    return sendMessage.setText("Setting");
                }
            }
        }
        return sendMessage.setText("Bad command");
    }
}
