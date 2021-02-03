package by.jrr.telegrambot;

import by.jrr.telegrambot.config.Mapper;
import by.jrr.telegrambot.servise.MessageService;
import by.jrr.telegrambot.servise.Telegrambot;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = {Telegrambot.class, Mapper.class, MessageService.class})
public class TelegrambotApplicationTests {

	@Test
	void contextLoads() {
	}

}
