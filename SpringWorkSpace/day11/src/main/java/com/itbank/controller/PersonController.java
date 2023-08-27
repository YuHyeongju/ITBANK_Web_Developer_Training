package com.itbank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.itbank.model.PersonVO;
import com.itbank.service.PersonService;

@Controller
@RequestMapping("/person")
public class PersonController {
	
	@Autowired
	private PersonService ps;
	
	private String path ="/person/view";
	
	@GetMapping("/view")
	public ModelAndView view() {
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("list", ps.getPersons());
		
		return mav;
	}
	
	
	@GetMapping("/write")
	public void write() {}
	
	@PostMapping("/write")
	public ModelAndView write(PersonVO per) {
		
		ModelAndView mav = new ModelAndView();
		
		int row = ps.addPer(per);
		
		String msg = "추가";
		msg += (row== 0) ? "실패":"성공";
		
		mav.addObject("row", row);
		mav.addObject("msg", msg);
		mav.addObject("path", path);
		mav.setViewName("msg");
		
		return mav;
	}
	//스프링은 url의 특정부분을 파라미터로 받을 수 있다.
	// 이때 , @PathVariable이라는 어노테이션을 사용
	@GetMapping("/delete/{name}")
	public ModelAndView delete(@PathVariable String name) {
		ModelAndView mav = new ModelAndView();
		int row = ps.delPer(name);
		
		String msg =  "삭제";
		msg += (row == 0)? "실패" : "성공";
		
		mav.addObject("row", row);
		mav.addObject("msg", msg);
		mav.addObject("path",path);
		mav.setViewName("msg");
		
		return mav;
	}
	@GetMapping("/update/{name}")
	public ModelAndView update(@PathVariable String name) {
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("row", ps.getPerson(name));
		mav.addObject("readonly", "readonly");
		mav.setViewName("person/write");
		
		return mav;
	}
	
	@PostMapping("/update/{name}")
	public ModelAndView update(PersonVO per) {
		ModelAndView mav = new ModelAndView();
		int row = ps.updatePer(per);
		
		String msg = "수정";
		msg += (row == 0)? "실패": "성공";
		
		mav.addObject("row" , row);
		mav.addObject("msg" , msg);
		mav.addObject("path" , path);
		mav.setViewName("msg");
		
		return mav;
	}
	
}
