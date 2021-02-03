package by.jrr.telegrambot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.telegram.telegrambots.ApiContextInitializer;

@SpringBootApplication
public class TelegramBotApplication {

	public static void main(String[] args) {
		ApiContextInitializer.init();
		SpringApplication.run(TelegramBotApplication.class, args);
	}

}
