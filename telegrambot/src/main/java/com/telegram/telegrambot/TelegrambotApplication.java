package com.telegram.telegrambot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.telegram.telegrambots.ApiContextInitializer;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import com.telegram.telegrambot.service.Telegrambot;

@SpringBootApplication
public class TelegrambotApplication {

	public static void main(String[] args) {

		ApiContextInitializer.init();

		TelegramBotsApi api = new TelegramBotsApi();

		try {
			api.registerBot(new Telegrambot());
		} catch (TelegramApiException e) {

		}
		SpringApplication.run(TelegrambotApplication.class, args);
	}

}
