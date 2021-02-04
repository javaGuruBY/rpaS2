package by.bpv.telegrambot;

import by.bpv.telegrambot.config.Mapper;
import by.bpv.telegrambot.service.MessageService;
import by.bpv.telegrambot.service.TelegramBot;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = {TelegramBot.class, Mapper.class, MessageService.class})
public  class TelegrambotApplicationTests {

	@Test
	void contextLoads() {
	}

}
