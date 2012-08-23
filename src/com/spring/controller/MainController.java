package com.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.spring.service.BoardService;

@Controller("mainController")
public class MainController {

	@Autowired
	private BoardService boardService;
	
	
	@RequestMapping("index.do")
	public ModelAndView IndexPage(){
		ModelAndView mav = new ModelAndView("index");
		mav.addObject("boardList",boardService.getBoardList());
		return mav;
	}
	
	
}
