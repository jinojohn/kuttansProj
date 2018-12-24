package com.welspun.welding.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.welspun.welding.model.ALPProgram;

@Controller
public class ALPSearchController {

	@RequestMapping(value= "/", method = RequestMethod.GET)
	public ModelAndView getALPSearchModule()
	{
		ModelAndView modelAndView = new ModelAndView();
		ALPProgram alp = new ALPProgram();
		modelAndView.setViewName("search");
		modelAndView.addObject("alp", alp);
		return modelAndView;
	}
	
}
