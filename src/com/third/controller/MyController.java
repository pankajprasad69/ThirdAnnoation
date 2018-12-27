package com.third.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class MyController extends AbstractController{

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest req,
			HttpServletResponse res) throws Exception {
		ModelAndView mv=new ModelAndView();
		//db
        mv.setViewName("home");
		
        return mv;
		//return ModelAndView("welcome");
		
	}
	

}
