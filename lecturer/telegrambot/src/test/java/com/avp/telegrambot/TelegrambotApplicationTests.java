package com.avp.telegrambot;

import com.avp.telegrambot.confige.Mapper;
import com.avp.telegrambot.service.MessageService;
import com.avp.telegrambot.service.TelegramBot;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest (classes = {TelegramBot.class, Mapper.class, MessageService.class})
public class TelegrambotApplicationTests {

	@Test
	void contextLoads() {
	}
}
