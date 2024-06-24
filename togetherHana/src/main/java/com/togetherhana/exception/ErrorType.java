package com.togetherhana.exception;

import org.springframework.http.HttpStatus;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public enum ErrorType {

	/**
	 * 400 BAD REQUEST
	 */
	BAD_REQUEST(HttpStatus.BAD_REQUEST, "잘못된 요청입니다."),
	ALREADY_GAME_CREATED(HttpStatus.BAD_REQUEST, "이미 진행중인 게임이 있습니다."),

	/**
	 * 401 UNAUTHROZIED
	 */
	UNAUTHORIZED(HttpStatus.UNAUTHORIZED, "인증되지 않았습니다."),

	/**
	 * 404 NOT FOUND
	 */
	NOT_FOUND(HttpStatus.NOT_FOUND, "존재하지 않는 리소스입니다."),
	SHARING_ACCOUNT_NOT_FOUND(HttpStatus.NOT_FOUND, "해당 모임통장이 존재하지 않습니다."),
	SHARING_MEMBER_NOT_FOUND(HttpStatus.NOT_FOUND, "해당 모임원이 존재하지 않습니다."),
	GAME_NOT_FOUND(HttpStatus.NOT_FOUND, "해당 게임이 존재하지 않습니다."),
	GAME_OPTION_NOT_FOUND(HttpStatus.NOT_FOUND, "해당 게임선택지가 존재하지 않습니다."),
	/**
	 * 500 INTERNAL SERVER
	 */
	INTERNAL_SERVER(HttpStatus.INTERNAL_SERVER_ERROR, "서버 에러가 발생했습니다");

	private final HttpStatus httpStatus;
	private final String message;

	public int getHttpStatusCode() {
		return httpStatus.value();
	}
}
