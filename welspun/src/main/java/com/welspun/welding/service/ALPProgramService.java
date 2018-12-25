package com.welspun.welding.service;

import java.util.List;

import com.welspun.welding.model.ALPProgram;

public interface ALPProgramService {
	
	public List<ALPProgram> findAll();
	
	public ALPProgram findOne(int id);
	
	public List<ALPProgram> findSearchSpecificParam(String baseMetal, Double thickness_1, Double thickness_2,
			Double impactTemp, Double weldActualImpact, Double hazActualImpact);

}
