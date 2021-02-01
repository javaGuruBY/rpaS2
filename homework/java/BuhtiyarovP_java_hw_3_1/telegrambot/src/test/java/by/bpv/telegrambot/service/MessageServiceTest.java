package by.bpv.telegrambot.service;

import by.bpv.telegrambot.TelegrambotApplicationTests;
import by.bpv.telegrambot.config.Mapper;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.io.File;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;


class MessageServiceTest extends TelegrambotApplicationTests {

    @Autowired
    TelegramBot telegramBot;
    @Autowired
    ObjectMapper objectMapper;
    @Autowired
    MessageService messageService;

    @Test
    void onBadCommandReceived() throws IOException {
        Update update = objectMapper.readValue(new File("src/test/resources/update.json"), Update.class);
        messageService.onUpdateReceived(update);

        SendMessage actualResult = messageService.onUpdateReceived(update);
        SendMessage expectedResult = createMessage("Bad command");

        Assertions.assertEquals(actualResult,expectedResult);
    }

    @Test
    void onStartReceived() throws IOException {
        Update update = objectMapper.readValue(new File("src/test/resources/start.json"), Update.class);
        messageService.onUpdateReceived(update);

        SendMessage actualResult = messageService.onUpdateReceived(update);
        SendMessage expectedResult = createMessage("Hello, my friend");

        Assertions.assertEquals(actualResult,expectedResult);
    }

    @Test
    void onSettingReceived() throws IOException {
        Update update = objectMapper.readValue(new File("src/test/resources/setting.json"), Update.class);
        messageService.onUpdateReceived(update);

        SendMessage actualResult = messageService.onUpdateReceived(update);
        SendMessage expectedResult = createMessage("Setting");

        Assertions.assertEquals(actualResult,expectedResult);
    }

    @Test
    void onHelpReceived() throws IOException {
        Update update = objectMapper.readValue(new File("src/test/resources/help.json"), Update.class);
        messageService.onUpdateReceived(update);

        SendMessage actualResult = messageService.onUpdateReceived(update);
        SendMessage expectedResult = createMessage("Help");

        Assertions.assertEquals(actualResult,expectedResult);
    }

    private SendMessage createMessage(String text){
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(947303898l);
        sendMessage.setText(text);
        return sendMessage;
    }
}