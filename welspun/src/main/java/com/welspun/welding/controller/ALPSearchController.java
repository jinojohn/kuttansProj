package com.welspun.welding.controller;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.welspun.welding.model.ALPProgram;
import com.welspun.welding.service.ALPProgramService;

@Controller
public class ALPSearchController {
	
	@Autowired
	ALPProgramService aLPProgramService;

	@RequestMapping(value= "/", method = RequestMethod.GET)
	public ModelAndView getALPSearchModule()
	{
		ModelAndView modelAndView = new ModelAndView();
		ALPProgram alp = new ALPProgram();
		modelAndView.setViewName("search");
		modelAndView.addObject("alp", alp);
		return modelAndView;
	}
	
	@RequestMapping(value= "/compare", method = RequestMethod.GET)
	public ModelAndView getComparisonData(@RequestParam(value="idList") String[] rows_selected) {		
		ModelAndView modelAndView = new ModelAndView();
		int[] intIds = Arrays.asList(rows_selected).stream().mapToInt(Integer::parseInt).toArray();
		List<Integer> intList = Arrays.stream(intIds).boxed().collect(Collectors.toList());
		List<ALPProgram> alpPgmList = aLPProgramService.findFromIds(intList);
		modelAndView.addObject("alpList", alpPgmList);
		modelAndView.setViewName("compare");
		
		return modelAndView;
	}
	
}
