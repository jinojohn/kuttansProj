package com.welspun.welding.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.apache.commons.lang3.StringUtils;

@Entity(name = "AlPProgram")
public class ALPProgram {

	@Id
	@GeneratedValue
	private Integer id;

	private String project;
	private String pqrNum;
	private String baseMetal;
	private Double thickness;
	private String diameter;
	private String pipeNum;

	private String gas;
	private String flowRate;
	private String wire;
	private String gmawDiameter;
	private String polarity;
	private String current;
	private String voltage;
	private String speed;
	private String heatInput;
	private String idBevelDepth;
	private String rootFace;
	private String odBevelDepth;
	private String odBevelAngle;
	private String idBevelAngle;
	private String idWire1;
	private String idWire2;
	private String idWire3;
	private String t2;
	private String t1;
	private String l;
	private String stickOutT2;
	private String stickOutT1;
	private String stickOutL;
	private String T2_T1;
	private String T1_L;
	private String idDCWireDia;
	private String idAC1WireDia;
	private String idAC2WireDia;
	private String idCurrentDCA;
	private String idCurrentAC1A;
	private String idCurrentAC2A;
	private String idVoltageDCV;
	private String idVoltageAC1V;
	private String idVoltageAC2V;
	private String idSpeed;
	private String idHeatInput;
	private String idFlux;
	private String odDCWire1;
	private String odAC1Wire2;
	private String odAC2Wire3;
	private String odAC3Wire4;
	private String o_t3;
	private String o_t2;
	private String o_t1;
	private String o_L;
	private String o_stickOutT3;
	private String o_stickOutT2;
	private String o_stickOutT1;
	private String o_stickOutL;
	private String o_T3_T2;
	private String o_T2_T1;
	private String o_T1_L;
	private String odDCWireDia;
	private String odAC1WireDia;
	private String odAC2WireDia;
	private String odAC3WireDia;
	private String odCurrentDCA;
	private String odCurrentAC1A;
	private String odCurrentAC2A;
	private String odCurrentAC3A;
	private String odVoltageDCV;
	private String odVoltageAC1V;
	private String odVoltageAC2V;
	private String odVoltageAC3V;
	private String odSpeed;
	private String odHeatInput;
	private String odFlux;
	private Double impactTemp;
	private String baseReqImpactMin;
	private String weldReqImpactMin;
	private String hazReqImpactMin;
	private String baseReqImpactAvg;
	private String weldReqImpactAvg;
	private String hazReqImpactAvg;
	private String baseActualImpact;
	private Double weldActualImpact;
	private Double hazActualImpact;
	private String baseHardnessMax;
	private String weldMaxHardness;
	private String hazMaxHardness;
	private String o_baseMinHardness;
	private String o_baseMaxHardness;
	private String o_hazMinHardness;
	private String o_hazMaxHardness;
	private String o_weldMinHardness;
	private String o_weldMaxHardness;
	private String twtYS1;
	private String twtUTS1;
	private String twtElongation1;
	private String bow;
	private String awtODYS;
	private String awtIDYS;
	private String awtODUTS;
	private String awtIDUTS;
	private String awtODElongation;
	private String awtIDElongation;
	private String awtIDYSUTS;
	private String awtODYSUTS;

	private String id_C;
	private String id_Si;
	private String id_Mn;
	private String id_P;
	private String id_S;
	private String id_Cr;
	private String id_Ni;
	private String id_Mo;
	private String id_Cu;
	private String id_Ti;
	private String id_Nb;
	private String id_V;
	private String id_B;
	private String id_N;
	private String id_Al;
	private String id_Ca;
	private String id_CePCM;
	private String id_CeIIW;
	private String id_CeCSA;

	private String od_C;
	private String od_Si;
	private String od_Mn;
	private String od_P;
	private String od_S;
	private String od_Cr;
	private String od_Ni;
	private String od_Mo;
	private String od_Cu;
	private String od_Ti;
	private String od_Nb;
	private String od_V;
	private String od_B;
	private String od_N;
	private String od_Al;
	private String od_Ca;
	private String od_CePCM;
	private String od_CeIIW;
	private String od_CeCSA;
	private String temp_impactTemp;

	public ALPProgram() {
	}

	public ALPProgram(String project, String pqrNum, String baseMetal, Double thickness, String diameter,
			String pipeNum, String gas, String flowRate, String wire, String gmawDiameter, String polarity,
			String current, String voltage, String speed, String heatInput, String idBevelDepth, String rootFace,
			String odBevelDepth, String odBevelAngle, String idBevelAngle, String idWire1, String idWire2,
			String idWire3, String t2, String t1, String l, String stickOutT2, String stickOutT1, String stickOutL,
			String t2_T1, String t1_L, String idDCWireDia, String idAC1WireDia, String idAC2WireDia,
			String idCurrentDCA, String idCurrentAC1A, String idCurrentAC2A, String idVoltageDCV, String idVoltageAC1V,
			String idVoltageAC2V, String idSpeed, String idHeatInput, String idFlux, String odDCWire1,
			String odAC1Wire2, String odAC2Wire3, String odAC3Wire4, String o_t3, String o_t2, String o_t1, String o_L,
			String o_stickOutT3, String o_stickOutT2, String o_stickOutT1, String o_stickOutL, String o_T3_T2,
			String o_T2_T1, String o_T1_L, String odDCWireDia, String odAC1WireDia, String odAC2WireDia,
			String odAC3WireDia, String odCurrentDCA, String odCurrentAC1A, String odCurrentAC2A, String odCurrentAC3A,
			String odVoltageDCV, String odVoltageAC1V, String odVoltageAC2V, String odVoltageAC3V, String odSpeed,
			String odHeatInput, String odFlux, Double impactTemp, String baseReqImpactMin, String weldReqImpactMin,
			String hazReqImpactMin, String baseReqImpactAvg, String weldReqImpactAvg, String hazReqImpactAvg,
			String baseActualImpact, Double weldActualImpact, Double hazActualImpact, String baseHardnessMax,
			String weldMaxHardness, String hazMaxHardness, String o_baseMinHardness, String o_baseMaxHardness,
			String o_hazMinHardness, String o_hazMaxHardness, String o_weldMinHardness, String o_weldMaxHardness,
			String twtYS1, String twtUTS1, String twtElongation1, String bow, String awtODYS, String awtIDYS,
			String awtODUTS, String awtIDUTS, String awtODElongation, String awtIDElongation, String awtIDYSUTS,
			String awtODYSUTS, String id_C, String id_Si, String id_Mn, String id_P, String id_S, String id_Cr,
			String id_Ni, String id_Mo, String id_Cu, String id_Ti, String id_Nb, String id_V, String id_B, String id_N,
			String id_Al, String id_Ca, String id_CePCM, String id_CeIIW, String id_CeCSA, String od_C, String od_Si,
			String od_Mn, String od_P, String od_S, String od_Cr, String od_Ni, String od_Mo, String od_Cu,
			String od_Ti, String od_Nb, String od_V, String od_B, String od_N, String od_Al, String od_Ca,
			String od_CePCM, String od_CeIIW, String od_CeCSA) {
		super();
		this.project = project;
		this.pqrNum = pqrNum;
		this.baseMetal = baseMetal;
		this.thickness = thickness;
		this.diameter = diameter;
		this.pipeNum = pipeNum;
		this.gas = gas;
		this.flowRate = flowRate;
		this.wire = wire;
		this.gmawDiameter = gmawDiameter;
		this.polarity = polarity;
		this.current = current;
		this.voltage = voltage;
		this.speed = speed;
		this.heatInput = heatInput;
		this.idBevelDepth = idBevelDepth;
		this.rootFace = rootFace;
		this.odBevelDepth = odBevelDepth;
		this.odBevelAngle = odBevelAngle;
		this.idBevelAngle = idBevelAngle;
		this.idWire1 = idWire1;
		this.idWire2 = idWire2;
		this.idWire3 = idWire3;
		this.t2 = t2;
		this.t1 = t1;
		this.l = l;
		this.stickOutT2 = stickOutT2;
		this.stickOutT1 = stickOutT1;
		this.stickOutL = stickOutL;
		T2_T1 = t2_T1;
		T1_L = t1_L;
		this.idDCWireDia = idDCWireDia;
		this.idAC1WireDia = idAC1WireDia;
		this.idAC2WireDia = idAC2WireDia;
		this.idCurrentDCA = idCurrentDCA;
		this.idCurrentAC1A = idCurrentAC1A;
		this.idCurrentAC2A = idCurrentAC2A;
		this.idVoltageDCV = idVoltageDCV;
		this.idVoltageAC1V = idVoltageAC1V;
		this.idVoltageAC2V = idVoltageAC2V;
		this.idSpeed = idSpeed;
		this.idHeatInput = idHeatInput;
		this.idFlux = idFlux;
		this.odDCWire1 = odDCWire1;
		this.odAC1Wire2 = odAC1Wire2;
		this.odAC2Wire3 = odAC2Wire3;
		this.odAC3Wire4 = odAC3Wire4;
		this.o_t3 = o_t3;
		this.o_t2 = o_t2;
		this.o_t1 = o_t1;
		this.o_L = o_L;
		this.o_stickOutT3 = o_stickOutT3;
		this.o_stickOutT2 = o_stickOutT2;
		this.o_stickOutT1 = o_stickOutT1;
		this.o_stickOutL = o_stickOutL;
		this.o_T3_T2 = o_T3_T2;
		this.o_T2_T1 = o_T2_T1;
		this.o_T1_L = o_T1_L;
		this.odDCWireDia = odDCWireDia;
		this.odAC1WireDia = odAC1WireDia;
		this.odAC2WireDia = odAC2WireDia;
		this.odAC3WireDia = odAC3WireDia;
		this.odCurrentDCA = odCurrentDCA;
		this.odCurrentAC1A = odCurrentAC1A;
		this.odCurrentAC2A = odCurrentAC2A;
		this.odCurrentAC3A = odCurrentAC3A;
		this.odVoltageDCV = odVoltageDCV;
		this.odVoltageAC1V = odVoltageAC1V;
		this.odVoltageAC2V = odVoltageAC2V;
		this.odVoltageAC3V = odVoltageAC3V;
		this.odSpeed = odSpeed;
		this.odHeatInput = odHeatInput;
		this.odFlux = odFlux;
		this.impactTemp = impactTemp;
		this.baseReqImpactMin = baseReqImpactMin;
		this.weldReqImpactMin = weldReqImpactMin;
		this.hazReqImpactMin = hazReqImpactMin;
		this.baseReqImpactAvg = baseReqImpactAvg;
		this.weldReqImpactAvg = weldReqImpactAvg;
		this.hazReqImpactAvg = hazReqImpactAvg;
		this.baseActualImpact = baseActualImpact;
		this.weldActualImpact = weldActualImpact;
		this.hazActualImpact = hazActualImpact;
		this.baseHardnessMax = baseHardnessMax;
		this.weldMaxHardness = weldMaxHardness;
		this.hazMaxHardness = hazMaxHardness;
		this.o_baseMinHardness = o_baseMinHardness;
		this.o_baseMaxHardness = o_baseMaxHardness;
		this.o_hazMinHardness = o_hazMinHardness;
		this.o_hazMaxHardness = o_hazMaxHardness;
		this.o_weldMinHardness = o_weldMinHardness;
		this.o_weldMaxHardness = o_weldMaxHardness;
		this.twtYS1 = twtYS1;
		this.twtUTS1 = twtUTS1;
		this.twtElongation1 = twtElongation1;
		this.bow = bow;
		this.awtODYS = awtODYS;
		this.awtIDYS = awtIDYS;
		this.awtODUTS = awtODUTS;
		this.awtIDUTS = awtIDUTS;
		this.awtODElongation = awtODElongation;
		this.awtIDElongation = awtIDElongation;
		this.awtIDYSUTS = awtIDYSUTS;
		this.awtODYSUTS = awtODYSUTS;
		this.id_C = id_C;
		this.id_Si = id_Si;
		this.id_Mn = id_Mn;
		this.id_P = id_P;
		this.id_S = id_S;
		this.id_Cr = id_Cr;
		this.id_Ni = id_Ni;
		this.id_Mo = id_Mo;
		this.id_Cu = id_Cu;
		this.id_Ti = id_Ti;
		this.id_Nb = id_Nb;
		this.id_V = id_V;
		this.id_B = id_B;
		this.id_N = id_N;
		this.id_Al = id_Al;
		this.id_Ca = id_Ca;
		this.id_CePCM = id_CePCM;
		this.id_CeIIW = id_CeIIW;
		this.id_CeCSA = id_CeCSA;
		this.od_C = od_C;
		this.od_Si = od_Si;
		this.od_Mn = od_Mn;
		this.od_P = od_P;
		this.od_S = od_S;
		this.od_Cr = od_Cr;
		this.od_Ni = od_Ni;
		this.od_Mo = od_Mo;
		this.od_Cu = od_Cu;
		this.od_Ti = od_Ti;
		this.od_Nb = od_Nb;
		this.od_V = od_V;
		this.od_B = od_B;
		this.od_N = od_N;
		this.od_Al = od_Al;
		this.od_Ca = od_Ca;
		this.od_CePCM = od_CePCM;
		this.od_CeIIW = od_CeIIW;
		this.od_CeCSA = od_CeCSA;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getProject() {
		return project;
	}

	public void setProject(String project) {
		this.project = project;
	}

	public String getPqrNum() {
		return pqrNum;
	}

	public void setPqrNum(String pqrNum) {
		this.pqrNum = pqrNum;
	}

	public String getBaseMetal() {
		return baseMetal;
	}

	public void setBaseMetal(String baseMetal) {
		this.baseMetal = baseMetal;
	}

	public Double getThickness() {
		return thickness;
	}

	public void setThickness(Double thickness) {
		this.thickness = thickness;
	}

	public String getDiameter() {
		return diameter;
	}

	public void setDiameter(String diameter) {
		this.diameter = diameter;
	}

	public String getPipeNum() {
		return pipeNum;
	}

	public void setPipeNum(String pipeNum) {
		this.pipeNum = pipeNum;
	}

	public String getGas() {
		return gas;
	}

	public void setGas(String gas) {
		this.gas = gas;
	}

	public String getFlowRate() {
		return flowRate;
	}

	public void setFlowRate(String flowRate) {
		this.flowRate = flowRate;
	}

	public String getWire() {
		return wire;
	}

	public void setWire(String wire) {
		this.wire = wire;
	}

	public String getGmawDiameter() {
		return gmawDiameter;
	}

	public void setGmawDiameter(String gmawDiameter) {
		this.gmawDiameter = gmawDiameter;
	}

	public String getPolarity() {
		return polarity;
	}

	public void setPolarity(String polarity) {
		this.polarity = polarity;
	}

	public String getCurrent() {
		return current;
	}

	public void setCurrent(String current) {
		this.current = current;
	}

	public String getVoltage() {
		return voltage;
	}

	public void setVoltage(String voltage) {
		this.voltage = voltage;
	}

	public String getSpeed() {
		return speed;
	}

	public void setSpeed(String speed) {
		this.speed = speed;
	}

	public String getHeatInput() {
		return heatInput;
	}

	public void setHeatInput(String heatInput) {
		this.heatInput = heatInput;
	}

	public String getIdBevelDepth() {
		return idBevelDepth;
	}

	public void setIdBevelDepth(String idBevelDepth) {
		this.idBevelDepth = idBevelDepth;
	}

	public String getRootFace() {
		return rootFace;
	}

	public void setRootFace(String rootFace) {
		this.rootFace = rootFace;
	}

	public String getOdBevelDepth() {
		return odBevelDepth;
	}

	public void setOdBevelDepth(String odBevelDepth) {
		this.odBevelDepth = odBevelDepth;
	}

	public String getOdBevelAngle() {
		return odBevelAngle;
	}

	public void setOdBevelAngle(String odBevelAngle) {
		this.odBevelAngle = odBevelAngle;
	}

	public String getIdBevelAngle() {
		return idBevelAngle;
	}

	public void setIdBevelAngle(String idBevelAngle) {
		this.idBevelAngle = idBevelAngle;
	}

	public String getIdWire1() {
		return idWire1;
	}

	public void setIdWire1(String idWire1) {
		this.idWire1 = idWire1;
	}

	public String getIdWire2() {
		return idWire2;
	}

	public void setIdWire2(String idWire2) {
		this.idWire2 = idWire2;
	}

	public String getIdWire3() {
		return idWire3;
	}

	public void setIdWire3(String idWire3) {
		this.idWire3 = idWire3;
	}

	public String getT2() {
		return t2;
	}

	public void setT2(String t2) {
		this.t2 = t2;
	}

	public String getT1() {
		return t1;
	}

	public void setT1(String t1) {
		this.t1 = t1;
	}

	public String getL() {
		return l;
	}

	public void setL(String l) {
		this.l = l;
	}

	public String getStickOutT2() {
		return stickOutT2;
	}

	public void setStickOutT2(String stickOutT2) {
		this.stickOutT2 = stickOutT2;
	}

	public String getStickOutT1() {
		return stickOutT1;
	}

	public void setStickOutT1(String stickOutT1) {
		this.stickOutT1 = stickOutT1;
	}

	public String getStickOutL() {
		return stickOutL;
	}

	public void setStickOutL(String stickOutL) {
		this.stickOutL = stickOutL;
	}

	public String getT2_T1() {
		return T2_T1;
	}

	public void setT2_T1(String t2_T1) {
		T2_T1 = t2_T1;
	}

	public String getT1_L() {
		return T1_L;
	}

	public void setT1_L(String t1_L) {
		T1_L = t1_L;
	}

	public String getIdDCWireDia() {
		return idDCWireDia;
	}

	public void setIdDCWireDia(String idDCWireDia) {
		this.idDCWireDia = idDCWireDia;
	}

	public String getIdAC1WireDia() {
		return idAC1WireDia;
	}

	public void setIdAC1WireDia(String idAC1WireDia) {
		this.idAC1WireDia = idAC1WireDia;
	}

	public String getIdAC2WireDia() {
		return idAC2WireDia;
	}

	public void setIdAC2WireDia(String idAC2WireDia) {
		this.idAC2WireDia = idAC2WireDia;
	}

	public String getIdCurrentDCA() {
		return idCurrentDCA;
	}

	public void setIdCurrentDCA(String idCurrentDCA) {
		this.idCurrentDCA = idCurrentDCA;
	}

	public String getIdCurrentAC1A() {
		return idCurrentAC1A;
	}

	public void setIdCurrentAC1A(String idCurrentAC1A) {
		this.idCurrentAC1A = idCurrentAC1A;
	}

	public String getIdCurrentAC2A() {
		return idCurrentAC2A;
	}

	public void setIdCurrentAC2A(String idCurrentAC2A) {
		this.idCurrentAC2A = idCurrentAC2A;
	}

	public String getIdVoltageDCV() {
		return idVoltageDCV;
	}

	public void setIdVoltageDCV(String idVoltageDCV) {
		this.idVoltageDCV = idVoltageDCV;
	}

	public String getIdVoltageAC1V() {
		return idVoltageAC1V;
	}

	public void setIdVoltageAC1V(String idVoltageAC1V) {
		this.idVoltageAC1V = idVoltageAC1V;
	}

	public String getIdVoltageAC2V() {
		return idVoltageAC2V;
	}

	public void setIdVoltageAC2V(String idVoltageAC2V) {
		this.idVoltageAC2V = idVoltageAC2V;
	}

	public String getIdSpeed() {
		return idSpeed;
	}

	public void setIdSpeed(String idSpeed) {
		this.idSpeed = idSpeed;
	}

	public String getIdHeatInput() {
		return idHeatInput;
	}

	public void setIdHeatInput(String idHeatInput) {
		this.idHeatInput = idHeatInput;
	}

	public String getIdFlux() {
		return idFlux;
	}

	public void setIdFlux(String idFlux) {
		this.idFlux = idFlux;
	}

	public String getOdDCWire1() {
		return odDCWire1;
	}

	public void setOdDCWire1(String odDCWire1) {
		this.odDCWire1 = odDCWire1;
	}

	public String getOdAC1Wire2() {
		return odAC1Wire2;
	}

	public void setOdAC1Wire2(String odAC1Wire2) {
		this.odAC1Wire2 = odAC1Wire2;
	}

	public String getOdAC2Wire3() {
		return odAC2Wire3;
	}

	public void setOdAC2Wire3(String odAC2Wire3) {
		this.odAC2Wire3 = odAC2Wire3;
	}

	public String getOdAC3Wire4() {
		return odAC3Wire4;
	}

	public void setOdAC3Wire4(String odAC3Wire4) {
		this.odAC3Wire4 = odAC3Wire4;
	}

	public String getO_t3() {
		return o_t3;
	}

	public void setO_t3(String o_t3) {
		this.o_t3 = o_t3;
	}

	public String getO_t2() {
		return o_t2;
	}

	public void setO_t2(String o_t2) {
		this.o_t2 = o_t2;
	}

	public String getO_t1() {
		return o_t1;
	}

	public void setO_t1(String o_t1) {
		this.o_t1 = o_t1;
	}

	public String getO_L() {
		return o_L;
	}

	public void setO_L(String o_L) {
		this.o_L = o_L;
	}

	public String getO_stickOutT3() {
		return o_stickOutT3;
	}

	public void setO_stickOutT3(String o_stickOutT3) {
		this.o_stickOutT3 = o_stickOutT3;
	}

	public String getO_stickOutT2() {
		return o_stickOutT2;
	}

	public void setO_stickOutT2(String o_stickOutT2) {
		this.o_stickOutT2 = o_stickOutT2;
	}

	public String getO_stickOutT1() {
		return o_stickOutT1;
	}

	public void setO_stickOutT1(String o_stickOutT1) {
		this.o_stickOutT1 = o_stickOutT1;
	}

	public String getO_stickOutL() {
		return o_stickOutL;
	}

	public void setO_stickOutL(String o_stickOutL) {
		this.o_stickOutL = o_stickOutL;
	}

	public String getO_T3_T2() {
		return o_T3_T2;
	}

	public void setO_T3_T2(String o_T3_T2) {
		this.o_T3_T2 = o_T3_T2;
	}

	public String getO_T2_T1() {
		return o_T2_T1;
	}

	public void setO_T2_T1(String o_T2_T1) {
		this.o_T2_T1 = o_T2_T1;
	}

	public String getO_T1_L() {
		return o_T1_L;
	}

	public void setO_T1_L(String o_T1_L) {
		this.o_T1_L = o_T1_L;
	}

	public String getOdDCWireDia() {
		return odDCWireDia;
	}

	public void setOdDCWireDia(String odDCWireDia) {
		this.odDCWireDia = odDCWireDia;
	}

	public String getOdAC1WireDia() {
		return odAC1WireDia;
	}

	public void setOdAC1WireDia(String odAC1WireDia) {
		this.odAC1WireDia = odAC1WireDia;
	}

	public String getOdAC2WireDia() {
		return odAC2WireDia;
	}

	public void setOdAC2WireDia(String odAC2WireDia) {
		this.odAC2WireDia = odAC2WireDia;
	}

	public String getOdAC3WireDia() {
		return odAC3WireDia;
	}

	public void setOdAC3WireDia(String odAC3WireDia) {
		this.odAC3WireDia = odAC3WireDia;
	}

	public String getOdCurrentDCA() {
		return odCurrentDCA;
	}

	public void setOdCurrentDCA(String odCurrentDCA) {
		this.odCurrentDCA = odCurrentDCA;
	}

	public String getOdCurrentAC1A() {
		return odCurrentAC1A;
	}

	public void setOdCurrentAC1A(String odCurrentAC1A) {
		this.odCurrentAC1A = odCurrentAC1A;
	}

	public String getOdCurrentAC2A() {
		return odCurrentAC2A;
	}

	public void setOdCurrentAC2A(String odCurrentAC2A) {
		this.odCurrentAC2A = odCurrentAC2A;
	}

	public String getOdCurrentAC3A() {
		return odCurrentAC3A;
	}

	public void setOdCurrentAC3A(String odCurrentAC3A) {
		this.odCurrentAC3A = odCurrentAC3A;
	}

	public String getOdVoltageDCV() {
		return odVoltageDCV;
	}

	public void setOdVoltageDCV(String odVoltageDCV) {
		this.odVoltageDCV = odVoltageDCV;
	}

	public String getOdVoltageAC1V() {
		return odVoltageAC1V;
	}

	public void setOdVoltageAC1V(String odVoltageAC1V) {
		this.odVoltageAC1V = odVoltageAC1V;
	}

	public String getOdVoltageAC2V() {
		return odVoltageAC2V;
	}

	public void setOdVoltageAC2V(String odVoltageAC2V) {
		this.odVoltageAC2V = odVoltageAC2V;
	}

	public String getOdVoltageAC3V() {
		return odVoltageAC3V;
	}

	public void setOdVoltageAC3V(String odVoltageAC3V) {
		this.odVoltageAC3V = odVoltageAC3V;
	}

	public String getOdSpeed() {
		return odSpeed;
	}

	public void setOdSpeed(String odSpeed) {
		this.odSpeed = odSpeed;
	}

	public String getOdHeatInput() {
		return odHeatInput;
	}

	public void setOdHeatInput(String odHeatInput) {
		this.odHeatInput = odHeatInput;
	}

	public String getOdFlux() {
		return odFlux;
	}

	public void setOdFlux(String odFlux) {
		this.odFlux = odFlux;
	}

	public Double getImpactTemp() {
		String temp = impactTemp!=null ? impactTemp.toString() : "";
		if(StringUtils.isEmpty(temp)) {
			setTemp_impactTemp("");
			return -999999.0;
		}
		else {
			setTemp_impactTemp(temp);
			return impactTemp;
		}
	}

	public void setImpactTemp(Double impactTemp) {
		this.impactTemp = impactTemp;
	}

	public String getBaseReqImpactMin() {
		return baseReqImpactMin;
	}

	public void setBaseReqImpactMin(String baseReqImpactMin) {
		this.baseReqImpactMin = baseReqImpactMin;
	}

	public String getWeldReqImpactMin() {
		return weldReqImpactMin;
	}

	public void setWeldReqImpactMin(String weldReqImpactMin) {
		this.weldReqImpactMin = weldReqImpactMin;
	}

	public String getHazReqImpactMin() {
		return hazReqImpactMin;
	}

	public void setHazReqImpactMin(String hazReqImpactMin) {
		this.hazReqImpactMin = hazReqImpactMin;
	}

	public String getBaseReqImpactAvg() {
		return baseReqImpactAvg;
	}

	public void setBaseReqImpactAvg(String baseReqImpactAvg) {
		this.baseReqImpactAvg = baseReqImpactAvg;
	}

	public String getWeldReqImpactAvg() {
		return weldReqImpactAvg;
	}

	public void setWeldReqImpactAvg(String weldReqImpactAvg) {
		this.weldReqImpactAvg = weldReqImpactAvg;
	}

	public String getHazReqImpactAvg() {
		return hazReqImpactAvg;
	}

	public void setHazReqImpactAvg(String hazReqImpactAvg) {
		this.hazReqImpactAvg = hazReqImpactAvg;
	}

	public String getBaseActualImpact() {
		return baseActualImpact;
	}

	public void setBaseActualImpact(String baseActualImpact) {
		this.baseActualImpact = baseActualImpact;
	}

	public Double getWeldActualImpact() {
		return weldActualImpact;
	}

	public void setWeldActualImpact(Double weldActualImpact) {
		this.weldActualImpact = weldActualImpact;
	}

	public Double getHazActualImpact() {
		return hazActualImpact;
	}

	public void setHazActualImpact(Double hazActualImpact) {
		this.hazActualImpact = hazActualImpact;
	}

	public String getBaseHardnessMax() {
		return baseHardnessMax;
	}

	public void setBaseHardnessMax(String baseHardnessMax) {
		this.baseHardnessMax = baseHardnessMax;
	}

	public String getWeldMaxHardness() {
		return weldMaxHardness;
	}

	public void setWeldMaxHardness(String weldMaxHardness) {
		this.weldMaxHardness = weldMaxHardness;
	}

	public String getHazMaxHardness() {
		return hazMaxHardness;
	}

	public void setHazMaxHardness(String hazMaxHardness) {
		this.hazMaxHardness = hazMaxHardness;
	}

	public String getO_baseMinHardness() {
		return o_baseMinHardness;
	}

	public void setO_baseMinHardness(String o_baseMinHardness) {
		this.o_baseMinHardness = o_baseMinHardness;
	}

	public String getO_baseMaxHardness() {
		return o_baseMaxHardness;
	}

	public void setO_baseMaxHardness(String o_baseMaxHardness) {
		this.o_baseMaxHardness = o_baseMaxHardness;
	}

	public String getO_hazMinHardness() {
		return o_hazMinHardness;
	}

	public void setO_hazMinHardness(String o_hazMinHardness) {
		this.o_hazMinHardness = o_hazMinHardness;
	}

	public String getO_hazMaxHardness() {
		return o_hazMaxHardness;
	}

	public void setO_hazMaxHardness(String o_hazMaxHardness) {
		this.o_hazMaxHardness = o_hazMaxHardness;
	}

	public String getO_weldMinHardness() {
		return o_weldMinHardness;
	}

	public void setO_weldMinHardness(String o_weldMinHardness) {
		this.o_weldMinHardness = o_weldMinHardness;
	}

	public String getO_weldMaxHardness() {
		return o_weldMaxHardness;
	}

	public void setO_weldMaxHardness(String o_weldMaxHardness) {
		this.o_weldMaxHardness = o_weldMaxHardness;
	}

	public String getTwtYS1() {
		return twtYS1;
	}

	public void setTwtYS1(String twtYS1) {
		this.twtYS1 = twtYS1;
	}

	public String getTwtUTS1() {
		return twtUTS1;
	}

	public void setTwtUTS1(String twtUTS1) {
		this.twtUTS1 = twtUTS1;
	}

	public String getTwtElongation1() {
		return twtElongation1;
	}

	public void setTwtElongation1(String twtElongation1) {
		this.twtElongation1 = twtElongation1;
	}

	public String getBow() {
		return bow;
	}

	public void setBow(String bow) {
		this.bow = bow;
	}

	public String getAwtODYS() {
		return awtODYS;
	}

	public void setAwtODYS(String awtODYS) {
		this.awtODYS = awtODYS;
	}

	public String getAwtIDYS() {
		return awtIDYS;
	}

	public void setAwtIDYS(String awtIDYS) {
		this.awtIDYS = awtIDYS;
	}

	public String getAwtODUTS() {
		return awtODUTS;
	}

	public void setAwtODUTS(String awtODUTS) {
		this.awtODUTS = awtODUTS;
	}

	public String getAwtIDUTS() {
		return awtIDUTS;
	}

	public void setAwtIDUTS(String awtIDUTS) {
		this.awtIDUTS = awtIDUTS;
	}

	public String getAwtODElongation() {
		return awtODElongation;
	}

	public void setAwtODElongation(String awtODElongation) {
		this.awtODElongation = awtODElongation;
	}

	public String getAwtIDElongation() {
		return awtIDElongation;
	}

	public void setAwtIDElongation(String awtIDElongation) {
		this.awtIDElongation = awtIDElongation;
	}

	public String getAwtIDYSUTS() {
		return awtIDYSUTS;
	}

	public void setAwtIDYSUTS(String awtIDYSUTS) {
		this.awtIDYSUTS = awtIDYSUTS;
	}

	public String getAwtODYSUTS() {
		return awtODYSUTS;
	}

	public void setAwtODYSUTS(String awtODYSUTS) {
		this.awtODYSUTS = awtODYSUTS;
	}

	public String getId_C() {
		return id_C;
	}

	public void setId_C(String id_C) {
		this.id_C = id_C;
	}

	public String getId_Si() {
		return id_Si;
	}

	public void setId_Si(String id_Si) {
		this.id_Si = id_Si;
	}

	public String getId_Mn() {
		return id_Mn;
	}

	public void setId_Mn(String id_Mn) {
		this.id_Mn = id_Mn;
	}

	public String getId_P() {
		return id_P;
	}

	public void setId_P(String id_P) {
		this.id_P = id_P;
	}

	public String getId_S() {
		return id_S;
	}

	public void setId_S(String id_S) {
		this.id_S = id_S;
	}

	public String getId_Cr() {
		return id_Cr;
	}

	public void setId_Cr(String id_Cr) {
		this.id_Cr = id_Cr;
	}

	public String getId_Ni() {
		return id_Ni;
	}

	public void setId_Ni(String id_Ni) {
		this.id_Ni = id_Ni;
	}

	public String getId_Mo() {
		return id_Mo;
	}

	public void setId_Mo(String id_Mo) {
		this.id_Mo = id_Mo;
	}

	public String getId_Cu() {
		return id_Cu;
	}

	public void setId_Cu(String id_Cu) {
		this.id_Cu = id_Cu;
	}

	public String getId_Ti() {
		return id_Ti;
	}

	public void setId_Ti(String id_Ti) {
		this.id_Ti = id_Ti;
	}

	public String getId_Nb() {
		return id_Nb;
	}

	public void setId_Nb(String id_Nb) {
		this.id_Nb = id_Nb;
	}

	public String getId_V() {
		return id_V;
	}

	public void setId_V(String id_V) {
		this.id_V = id_V;
	}

	public String getId_B() {
		return id_B;
	}

	public void setId_B(String id_B) {
		this.id_B = id_B;
	}

	public String getId_N() {
		return id_N;
	}

	public void setId_N(String id_N) {
		this.id_N = id_N;
	}

	public String getId_Al() {
		return id_Al;
	}

	public void setId_Al(String id_Al) {
		this.id_Al = id_Al;
	}

	public String getId_Ca() {
		return id_Ca;
	}

	public void setId_Ca(String id_Ca) {
		this.id_Ca = id_Ca;
	}

	public String getId_CePCM() {
		return id_CePCM;
	}

	public void setId_CePCM(String id_CePCM) {
		this.id_CePCM = id_CePCM;
	}

	public String getId_CeIIW() {
		return id_CeIIW;
	}

	public void setId_CeIIW(String id_CeIIW) {
		this.id_CeIIW = id_CeIIW;
	}

	public String getId_CeCSA() {
		return id_CeCSA;
	}

	public void setId_CeCSA(String id_CeCSA) {
		this.id_CeCSA = id_CeCSA;
	}

	public String getOd_C() {
		return od_C;
	}

	public void setOd_C(String od_C) {
		this.od_C = od_C;
	}

	public String getOd_Si() {
		return od_Si;
	}

	public void setOd_Si(String od_Si) {
		this.od_Si = od_Si;
	}

	public String getOd_Mn() {
		return od_Mn;
	}

	public void setOd_Mn(String od_Mn) {
		this.od_Mn = od_Mn;
	}

	public String getOd_P() {
		return od_P;
	}

	public void setOd_P(String od_P) {
		this.od_P = od_P;
	}

	public String getOd_S() {
		return od_S;
	}

	public void setOd_S(String od_S) {
		this.od_S = od_S;
	}

	public String getOd_Cr() {
		return od_Cr;
	}

	public void setOd_Cr(String od_Cr) {
		this.od_Cr = od_Cr;
	}

	public String getOd_Ni() {
		return od_Ni;
	}

	public void setOd_Ni(String od_Ni) {
		this.od_Ni = od_Ni;
	}

	public String getOd_Mo() {
		return od_Mo;
	}

	public void setOd_Mo(String od_Mo) {
		this.od_Mo = od_Mo;
	}

	public String getOd_Cu() {
		return od_Cu;
	}

	public void setOd_Cu(String od_Cu) {
		this.od_Cu = od_Cu;
	}

	public String getOd_Ti() {
		return od_Ti;
	}

	public void setOd_Ti(String od_Ti) {
		this.od_Ti = od_Ti;
	}

	public String getOd_Nb() {
		return od_Nb;
	}

	public void setOd_Nb(String od_Nb) {
		this.od_Nb = od_Nb;
	}

	public String getOd_V() {
		return od_V;
	}

	public void setOd_V(String od_V) {
		this.od_V = od_V;
	}

	public String getOd_B() {
		return od_B;
	}

	public void setOd_B(String od_B) {
		this.od_B = od_B;
	}

	public String getOd_N() {
		return od_N;
	}

	public void setOd_N(String od_N) {
		this.od_N = od_N;
	}

	public String getOd_Al() {
		return od_Al;
	}

	public void setOd_Al(String od_Al) {
		this.od_Al = od_Al;
	}

	public String getOd_Ca() {
		return od_Ca;
	}

	public void setOd_Ca(String od_Ca) {
		this.od_Ca = od_Ca;
	}

	public String getOd_CePCM() {
		return od_CePCM;
	}

	public void setOd_CePCM(String od_CePCM) {
		this.od_CePCM = od_CePCM;
	}

	public String getOd_CeIIW() {
		return od_CeIIW;
	}

	public void setOd_CeIIW(String od_CeIIW) {
		this.od_CeIIW = od_CeIIW;
	}

	public String getOd_CeCSA() {
		return od_CeCSA;
	}

	public void setOd_CeCSA(String od_CeCSA) {
		this.od_CeCSA = od_CeCSA;
	}

	public String getTemp_impactTemp() {
		return temp_impactTemp;
	}

	public void setTemp_impactTemp(String temp_impactTemp) {
		this.temp_impactTemp = temp_impactTemp;
	}
}
