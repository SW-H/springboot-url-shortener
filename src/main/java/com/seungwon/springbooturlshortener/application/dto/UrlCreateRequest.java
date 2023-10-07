package com.seungwon.springbooturlshortener.application.dto;

import org.hibernate.validator.constraints.URL;

import com.seungwon.springbooturlshortener.domain.Url;

import jakarta.validation.constraints.NotBlank;
import lombok.NonNull;

public record UrlCreateRequest(
	@NonNull
	@NotBlank
	@URL(message = "유효한 URL이 아닙니다.")
	String originalUrl,

	String strategy
) {
	public static Url from(UrlCreateRequest urlCreateRequest) {
		return new Url(urlCreateRequest.originalUrl);
	}
}
