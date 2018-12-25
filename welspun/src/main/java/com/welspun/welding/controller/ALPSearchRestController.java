package com.welspun.welding.controller;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.welspun.welding.model.ALPProgram;
import com.welspun.welding.service.ALPProgramService;

@RestController
public class ALPSearchRestController {
	
	@Autowired
	ALPProgramService aLPProgramService;
	
	@RequestMapping(value="/search/parameters", method = RequestMethod.GET)
	public List<ALPProgram> getALPList(@RequestParam("impactHaz") String impactHaz, @RequestParam("baseMetal") String baseMetal,
			@RequestParam("thickness") String thickness, @RequestParam("impactTemp") String impactTemp,
			@RequestParam("impactweld") String impactweld) {
		List<ALPProgram> alpList = new ArrayList<ALPProgram>();
		if(StringUtils.isAllEmpty(impactHaz) && StringUtils.isEmpty(baseMetal) &&
				StringUtils.isAllEmpty(thickness) && StringUtils.isEmpty(impactTemp) && 
				StringUtils.isAllEmpty(impactweld)) {
			alpList = aLPProgramService.findAll();
		}
		else {
			alpList = aLPProgramService.findSearchSpecificParam(baseMetal, getThickness_1(thickness), getThickness_2(thickness),
					getImpactTemp(impactTemp), getImpactWeld(impactweld), getImpactHaz(impactHaz));
		}
		return alpList;
	}
	
	@RequestMapping(value="/alpdetails", method = RequestMethod.GET)
	public ModelAndView getALPDetails(@RequestParam("id") String id) {
		ALPProgram alp = new ALPProgram();
		alp = aLPProgramService.findOne(Integer.parseInt(id));
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("pgmDetail");
		modelAndView.addObject("alp", alp);
		return modelAndView;
	}

	private Double getImpactHaz(String impactHaz) {
		if(StringUtils.isAllEmpty(impactHaz) || "undefined".equals(impactHaz)) {
			impactHaz = "-999999.0";
		}
		return Double.parseDouble(impactHaz);
	}

	private Double getImpactWeld(String impactweld) {
		if(StringUtils.isAllEmpty(impactweld) || "undefined".equals(impactweld)) {
			impactweld = "-999999.0";
		}
		return Double.parseDouble(impactweld);
	}

	private Double getImpactTemp(String impactTemp) {
		if(StringUtils.isAllEmpty(impactTemp) || "undefined".equals(impactTemp)) {
			impactTemp = "999999.0";
		}
		return Double.parseDouble(impactTemp);
	}

	private Double getThickness_2(String thickness) {
		Double thicknessDBL_2 = 9999999.0;
		if(StringUtils.isEmpty(thickness)) {
			return thicknessDBL_2;
		}
		else {
			return Double.parseDouble(thickness)+1;
		}
	}

	private Double getThickness_1(String thickness) {
		Double thicknessDBL_1 = -9999999.0;
		if(StringUtils.isEmpty(thickness)) {
			return thicknessDBL_1;
		}
		else {
			return Double.parseDouble(thickness)-1;
		}
	}

}
