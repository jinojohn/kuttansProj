package com.welspun.welding.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.welspun.welding.model.ALPProgram;
import com.welspun.welding.repository.ALPProgramRepository;

@Service
public class ALPProgramServiceImpl implements ALPProgramService {

	@Autowired
	ALPProgramRepository aLPProgramRepository;
	
	@Override
	public List<ALPProgram> findAll() {
		List<ALPProgram> alpList = new ArrayList<ALPProgram>();
		alpList = aLPProgramRepository.findAll();
		return alpList;
	}

	@Override
	public List<ALPProgram> findSearchSpecificParam(String baseMetal, Double thickness_1, Double thickness_2,
			Double impactTemp, Double weldActualImpact, Double hazActualImpact) {
		List<ALPProgram> alpList = new ArrayList<ALPProgram>();
		alpList = aLPProgramRepository.findFromSearchParam(baseMetal, thickness_1, thickness_2, impactTemp, weldActualImpact, hazActualImpact);
		return alpList;
	}

	@Override
	public ALPProgram findOne(int id) {		
		return aLPProgramRepository.findById(id).get();
	}

}
