package com.welspun.welding.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.welspun.welding.model.ALPProgram;

@Repository("ALPProgramRepository")
public interface ALPProgramRepository extends JpaRepository<ALPProgram, Integer> {
	
	@Query("From AlPProgram a where a.baseMetal like %:baseMetal% and a.thickness BETWEEN :thickness_1 and :thickness_2"
			+ " and a.impactTemp <=:impactTemp and a.weldActualImpact >=:weldActualImpact and a.hazActualImpact>=:hazActualImpact" )
	public List<ALPProgram> findFromSearchParam(@Param("baseMetal") String baseMetal, @Param("thickness_1") Double thickness_1,
			@Param("thickness_2") Double thickness_2, @Param("impactTemp") Double impactTemp, @Param("weldActualImpact") Double weldActualImpact,
			@Param("hazActualImpact") Double hazActualImpact);

}
