package com.itbank.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;

// 내가 만드는 예외 클래스
@ControllerAdvice
public class StringEmptyException extends Exception {
	
	private static final long serialVersionUID = 1L;
	
	
	
	
	@Override
	public String getMessage() {
		return "문자열의 값이 비었습니다.";
	}
}
