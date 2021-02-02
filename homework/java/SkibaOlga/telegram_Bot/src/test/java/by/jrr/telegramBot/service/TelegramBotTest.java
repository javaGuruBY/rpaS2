package by.jrr.telegramBot.service;

import by.jrr.telegramBot.TelegramBotApplicationTests;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.io.File;
import java.io.IOException;

class TelegramBotTest extends TelegramBotApplicationTests {

    @Autowired
    TelegramBot telegramBot;
    @Autowired
    ObjectMapper objectMapper;

//    @Test
    void onUpdateReceived() throws IOException {
        Update update = objectMapper.readValue(new File("src/test/resources/update.json"), Update.class);
        telegramBot.onUpdateReceived(update);
    }
//    @Test
    void sendMessage() throws TelegramApiException {
            SendMessage sendMessage =new SendMessage();
            sendMessage.setChatId(551522843L);
            sendMessage.setText("Hello, Bot!");
            telegramBot.execute(sendMessage);
        }
    }
