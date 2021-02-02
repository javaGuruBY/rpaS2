package by.jrr.telegramBot.service;

import by.jrr.telegramBot.TelegramBotApplicationTests;
import by.jrr.telegramBot.config.Mapper;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;

import java.io.File;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MessageServiceTest extends TelegramBotApplicationTests {

    @Autowired
    TelegramBot telegramBot;
    @Autowired
    ObjectMapper objectMapper;
    @Autowired
    MessageService messageService;

    @Test
    void onUnknownReceived() throws IOException {
        Update update = objectMapper.readValue(new File("src/test/resources/update.json"), Update.class);
        SendMessage actualResult = messageService.onUpdateReceived(update);
        SendMessage expectedResalt = makeMessage("Do no!");
        assertEquals(expectedResalt, actualResult);
    }
    @Test
    void onSettingsReceived() throws IOException {
        Update update = objectMapper.readValue(new File("src/test/resources/settings.json"), Update.class);
        SendMessage actualResult = messageService.onUpdateReceived(update);
        SendMessage expectedResalt = makeMessage("Settings!");
        assertEquals(expectedResalt, actualResult);
    }
    @Test
    void onStartReceived() throws IOException {
        Update update = objectMapper.readValue(new File("src/test/resources/start.json"), Update.class);
        SendMessage actualResult = messageService.onUpdateReceived(update);
        SendMessage expectedResalt = makeMessage("Hello!");
        assertEquals(expectedResalt, actualResult);
    }
    @Test
    void onHelpReceived() throws IOException {
        Update update = objectMapper.readValue(new File("src/test/resources/help.json"), Update.class);
        SendMessage actualResult = messageService.onUpdateReceived(update);
        SendMessage expectedResalt = makeMessage("Help!");
        assertEquals(expectedResalt, actualResult);
    }
    private SendMessage makeMessage(String text) {
        SendMessage sendMessage =new SendMessage();
        sendMessage.setChatId(551522843L);
        sendMessage.setText(text);
        return sendMessage;
    }

}