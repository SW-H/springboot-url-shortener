package com.seungwon.springbooturlshortener.application;

import com.seungwon.springbooturlshortener.domain.Url;

public interface UrlShortenService {

	String shorten(Url original);

	public static UrlShortenService from(String strategy) {
		switch (strategy) {
			case "random" -> {
				return new RandomUrlShortenService();
			}
			default -> {
				return new Base64UrlShortenService();
			}
		}
	}
}
