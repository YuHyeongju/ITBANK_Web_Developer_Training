package com.itbank.controller;

import java.io.IOException;
import java.net.MalformedURLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.itbank.service.Ex01Service;

@Controller
public class Ex02Controller {
	
	@Autowired private Ex01Service es;

	@GetMapping("/ex02")
	public void ex02() {}
	
	@GetMapping(value ="/ex02/js", produces = "application/json; charset=utf-8")
	@ResponseBody // 컨트롤러 함수가 viewName을 반환하지 않고 응답 그 자체를 반환
	public String ex02JS() throws MalformedURLException, IOException
	{
		String json = es.getFestivalJson();
		return json;
	}
}
