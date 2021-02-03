package zhdanokla.telegrambot;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import zhdanokla.telegrambot.config.Mapper;
import zhdanokla.telegrambot.service.MessageService;
import zhdanokla.telegrambot.service.TelegramBot;

@SpringBootTest(classes = {TelegramBot.class, Mapper.class, MessageService.class})
public class TelegrambotApplicationTests {

	@Test
	void contextLoads() {
	}

}
