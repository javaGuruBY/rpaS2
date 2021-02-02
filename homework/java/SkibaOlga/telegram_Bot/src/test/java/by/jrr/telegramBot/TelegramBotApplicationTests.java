package by.jrr.telegramBot;

import by.jrr.telegramBot.config.Mapper;
import by.jrr.telegramBot.service.MessageService;
import by.jrr.telegramBot.service.TelegramBot;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = {TelegramBot.class, Mapper.class, MessageService.class})
public class TelegramBotApplicationTests {

	@Test
	void contextLoads() {
	}

}
