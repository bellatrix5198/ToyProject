package com.telegram.telegrambot.service;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class TorrentCrawling {
	private WebDriver driver;

	public void init() {
		System.setProperty("webdriver.chrome.driver", "/Users/ihagjun/Documents/chromedriver");

		ChromeOptions options = new ChromeOptions();
		options.addArguments("headless");

		try {
			driver = new ChromeDriver(options);
		} catch (Exception e) {
			log.error("########## [driver error] msg: {}, cause: {}", e.getMessage(), e.getCause());
			return;
		}

		driver.get("https://torrentlike.com");

	}
}
