package by.alexandrR.TelegramBot.service;

import by.alexandrR.TelegramBot.config.Mapper;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;

import java.io.File;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;
@SpringBootTest(classes = {TelegramBot.class, Mapper.class, MessageService.class})

class MessageServiceTest {

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
        SendMessage expectedResult = makeMessage("Сейчас я тебя не понимаю. Напиши /start, /settings, /help либо задай правильный вопрос");
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void onStartReceived() throws IOException {
        Update update = objectMapper.readValue(new File("src/test/resources/start.json"), Update.class);
        SendMessage actualResult = messageService.onUpdateReceived(update);
        SendMessage expectedResult = makeMessage("Приветствую, друг");
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void onSettingsReceived() throws IOException {
        Update update = objectMapper.readValue(new File("src/test/resources/settings.json"), Update.class);
        SendMessage actualResult = messageService.onUpdateReceived(update);
        SendMessage expectedResult = makeMessage("Что нужно настроить?");
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void onHelpReceived() throws IOException {
        Update update = objectMapper.readValue(new File("src/test/resources/help.json"), Update.class);
        SendMessage actualResult = messageService.onUpdateReceived(update);
        SendMessage expectedResult = makeMessage("Нужна моя помощь? Я готов помочь!");
        assertEquals(expectedResult, actualResult);
    }
    @Test
    void onAnythingReceived() throws IOException {
        Update update = objectMapper.readValue(new File("src/test/resources/anything.json"), Update.class);
        SendMessage actualResult = messageService.onUpdateReceived(update);
        SendMessage expectedResult = makeMessage("Тебе рассказать о себе, или может быть о создании мира?");
        assertEquals(expectedResult, actualResult);
    }
    @Test
    void onWhoAreYouReceived() throws IOException {
        Update update = objectMapper.readValue(new File("src/test/resources/WhoAreYou.json"), Update.class);
        SendMessage actualResult = messageService.onUpdateReceived(update);
        SendMessage expectedResult = makeMessage("Меня создал самый великий программер. Тот, чьё имя нельзя называть! :0");
        assertEquals(expectedResult, actualResult);
    }

    private SendMessage makeMessage(String text) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(447993869L);
        sendMessage.setText(text);
        return sendMessage;

    }
}