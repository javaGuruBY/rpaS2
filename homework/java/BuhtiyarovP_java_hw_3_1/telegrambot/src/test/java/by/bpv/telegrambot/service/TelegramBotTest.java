package by.bpv.telegrambot.service;

import by.bpv.telegrambot.config.Mapper;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.io.File;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(classes = {TelegramBot.class, Mapper.class})

class TelegramBotTest {

    @Autowired
    TelegramBot telegramBot;
    @Autowired
    ObjectMapper objectMapper;

 //   @Test
    void onUpdateReceived() throws IOException {
        Update update = objectMapper.readValue(new File("src/test/resources/update.json"), Update.class);
        telegramBot.onUpdateReceived(update);
    }

 //   @Test
    void sendMessage() throws TelegramApiException {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(947303898l);
        sendMessage.setText("Hello");
        telegramBot.execute(sendMessage);
    }
}