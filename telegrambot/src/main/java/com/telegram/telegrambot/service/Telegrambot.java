package com.telegram.telegrambot.service;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Telegrambot extends TelegramLongPollingBot {

	@Override
	public void onUpdateReceived(Update update) {
		SendMessage massage = new SendMessage();

		massage.setChatId(update.getMessage().getChatId()).setText("hello telegram");

		try {
			execute(massage);
		} catch (TelegramApiException e) {

		}
	}

	@Override
	public String getBotUsername() {
		return "Test_5198bot";
	}

	@Override
	public String getBotToken() {
		return "1171338273:AAHEKyWp4jGzgx1dBqFWe2Cga3MP6LhuhIk";
	}

}
