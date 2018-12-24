package com.welspun.welding.resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.welspun.welding.model.ALPProgram;
import com.welspun.welding.repository.ALPProgramRepository;

@Component
public class ExcelToDBProcessor {

	@Value("${data.location}")
	private String dataLoc;

	@Autowired
	ALPProgramRepository aLPProgramRepository;

	private Log LOG = LogFactory.getLog(ExcelToDBProcessor.class);

	int counter = 0;

	@Scheduled(fixedRate = 3000)
	public void fetchDataFromExcel() {

		String[] extensions = { "xls", "xlsx", "xlsm" };
		List<File> files = (List<File>) FileUtils.listFiles(new File(dataLoc + "/poll"), extensions, true);

		for (File dataFile : files) {
			LOG.info("Picked up the file: " + dataFile.getName() + " for processing");

			try {
				InputStream inStream = new FileInputStream(dataFile);
				Workbook dataWrkbook = WorkbookFactory.create(inStream);
				Sheet sheet = dataWrkbook.getSheetAt(0);
				int noOfColumns = sheet.getRow(0).getLastCellNum();
				List<ALPProgram> alpList = new ArrayList<>();

				for (int i = 1; i < noOfColumns; i++) {
					int lastRowNum = sheet.getLastRowNum();
					int j = 0;
					counter = 0;

					String project = getData(lastRowNum, sheet, j, i);
					String pqrNum = getData(lastRowNum, sheet, j, i);
					String baseMetal = getData(lastRowNum, sheet, j, i);
					Double thickness = Double.parseDouble(getData(lastRowNum, sheet, j, i));
					String diameter = getData(lastRowNum, sheet, j, i);
					String pipeNum = getData(lastRowNum, sheet, j, i);
					counter++;
					String gas = getData(lastRowNum, sheet, j, i);
					String flowRate = getData(lastRowNum, sheet, j, i);
					String wire = getData(lastRowNum, sheet, j, i);
					String gmawDiameter = getData(lastRowNum, sheet, j, i);
					String polarity = getData(lastRowNum, sheet, j, i);
					String current = getData(lastRowNum, sheet, j, i);
					String volage = getData(lastRowNum, sheet, j, i);
					String speed = getData(lastRowNum, sheet, j, i);
					String heatInput = getData(lastRowNum, sheet, j, i);
					String idBevelDepth = getData(lastRowNum, sheet, j, i);
					String rootFace = getData(lastRowNum, sheet, j, i);
					String odBevelDepth = getData(lastRowNum, sheet, j, i);
					String odBevelAngle = getData(lastRowNum, sheet, j, i);
					String idBevelAngle = getData(lastRowNum, sheet, j, i);
					String idWire1 = getData(lastRowNum, sheet, j, i);
					String idWire2 = getData(lastRowNum, sheet, j, i);
					String idWire3 = getData(lastRowNum, sheet, j, i);
					String t2 = getData(lastRowNum, sheet, j, i);
					String t1 = getData(lastRowNum, sheet, j, i);
					String l = getData(lastRowNum, sheet, j, i);
					String stickOutT2 = getData(lastRowNum, sheet, j, i);
					String stickOutT1 = getData(lastRowNum, sheet, j, i);
					String stickOutL = getData(lastRowNum, sheet, j, i);
					String T2_T1 = getData(lastRowNum, sheet, j, i);
					String T1_L = getData(lastRowNum, sheet, j, i);
					String idDCWireDia = getData(lastRowNum, sheet, j, i);
					String idAC1WireDia = getData(lastRowNum, sheet, j, i);
					String idAC2WireDia = getData(lastRowNum, sheet, j, i);
					String idCurrentDCA = getData(lastRowNum, sheet, j, i);
					String idCurrentAC1A = getData(lastRowNum, sheet, j, i);
					String idCurrentAC2A = getData(lastRowNum, sheet, j, i);
					String idVoltageDCV = getData(lastRowNum, sheet, j, i);
					String idVoltageAC1V = getData(lastRowNum, sheet, j, i);
					String idVoltageAC2V = getData(lastRowNum, sheet, j, i);
					String idSpeed = getData(lastRowNum, sheet, j, i);
					String idHeatInput = getData(lastRowNum, sheet, j, i);
					String idFlux = getData(lastRowNum, sheet, j, i);
					String odDCWire1 = getData(lastRowNum, sheet, j, i);
					String odAC1Wire2 = getData(lastRowNum, sheet, j, i);
					String odAC2Wire3 = getData(lastRowNum, sheet, j, i);
					String odAC3Wire4 = getData(lastRowNum, sheet, j, i);
					String o_t3 = getData(lastRowNum, sheet, j, i);
					String o_t2 = getData(lastRowNum, sheet, j, i);
					String o_t1 = getData(lastRowNum, sheet, j, i);
					String o_L = getData(lastRowNum, sheet, j, i);
					String o_stickOutT3 = getData(lastRowNum, sheet, j, i);
					String o_stickOutT2 = getData(lastRowNum, sheet, j, i);
					String o_stickOutT1 = getData(lastRowNum, sheet, j, i);
					String o_stickOutL = getData(lastRowNum, sheet, j, i);
					String o_T3_T2 = getData(lastRowNum, sheet, j, i);
					String o_T2_T1 = getData(lastRowNum, sheet, j, i);
					String o_T1_L = getData(lastRowNum, sheet, j, i);
					String odDCWireDia = getData(lastRowNum, sheet, j, i);
					String odAC1WireDia = getData(lastRowNum, sheet, j, i);
					String odAC2WireDia = getData(lastRowNum, sheet, j, i);
					String odAC3WireDia = getData(lastRowNum, sheet, j, i);
					String odCurrentDCA = getData(lastRowNum, sheet, j, i);
					String odCurrentAC1A = getData(lastRowNum, sheet, j, i);
					String odCurrentAC2A = getData(lastRowNum, sheet, j, i);
					String odCurrentAC3A = getData(lastRowNum, sheet, j, i);
					String odVoltageDCV = getData(lastRowNum, sheet, j, i);
					String odVoltageAC1V = getData(lastRowNum, sheet, j, i);
					String odVoltageAC2V = getData(lastRowNum, sheet, j, i);
					String odVoltageAC3V = getData(lastRowNum, sheet, j, i);
					String odSpeed = getData(lastRowNum, sheet, j, i);
					String odHeatInput = getData(lastRowNum, sheet, j, i);
					String odFlux = getData(lastRowNum, sheet, j, i);
					String impactTempStr = getData(lastRowNum, sheet, j, i);
					Double impactTemp = StringUtils.isEmpty(impactTempStr) ? null : Double.parseDouble(impactTempStr);
					String baseReqImpactMin = getData(lastRowNum, sheet, j, i);
					String weldReqImpactMin = getData(lastRowNum, sheet, j, i);
					String hazReqImpactMin = getData(lastRowNum, sheet, j, i);
					String baseReqImpactAvg = getData(lastRowNum, sheet, j, i);
					String weldReqImpactAvg = getData(lastRowNum, sheet, j, i);
					String hazReqImpactAvg = getData(lastRowNum, sheet, j, i);
					String baseActualImpact = getData(lastRowNum, sheet, j, i);
					String weldActStr = getData(lastRowNum, sheet, j, i);
					Double weldActualImpact = StringUtils.isEmpty(weldActStr) ? null : Double.parseDouble(weldActStr);
					String hazActImpStr = getData(lastRowNum, sheet, j, i);
					Double hazActualImpact = StringUtils.isEmpty(hazActImpStr) ? null : Double.parseDouble(hazActImpStr);
					String baseHardnessMax = getData(lastRowNum, sheet, j, i);
					String weldMaxHardness = getData(lastRowNum, sheet, j, i);
					String hazMaxHardness = getData(lastRowNum, sheet, j, i);
					String o_baseMinHardness = getData(lastRowNum, sheet, j, i);
					String o_baseMaxHardness = getData(lastRowNum, sheet, j, i);
					String o_hazMinHardness = getData(lastRowNum, sheet, j, i);
					String o_hazMaxHardness = getData(lastRowNum, sheet, j, i);
					String o_weldMinHardness = getData(lastRowNum, sheet, j, i);
					String o_weldMaxHardness = getData(lastRowNum, sheet, j, i);
					String twtYS1 = getData(lastRowNum, sheet, j, i);
					String twtUTS1 = getData(lastRowNum, sheet, j, i);
					String twtElongation1 = getData(lastRowNum, sheet, j, i);
					String bow = getData(lastRowNum, sheet, j, i);
					String awtODYS = getData(lastRowNum, sheet, j, i);
					String awtIDYS = getData(lastRowNum, sheet, j, i);
					String awtODUTS = getData(lastRowNum, sheet, j, i);
					String awtIDUTS = getData(lastRowNum, sheet, j, i);
					String awtODElongation = getData(lastRowNum, sheet, j, i);
					String awtIDElongation = getData(lastRowNum, sheet, j, i);
					String awtIDYSUTS = getData(lastRowNum, sheet, j, i);
					String awtODYSUTS = getData(lastRowNum, sheet, j, i);
					counter++;

					String id_C = getData(lastRowNum, sheet, j, i);
					String id_Si = getData(lastRowNum, sheet, j, i);
					String id_Mn = getData(lastRowNum, sheet, j, i);
					String id_P = getData(lastRowNum, sheet, j, i);
					String id_S = getData(lastRowNum, sheet, j, i);
					String id_Cr = getData(lastRowNum, sheet, j, i);
					String id_Ni = getData(lastRowNum, sheet, j, i);
					String id_Mo = getData(lastRowNum, sheet, j, i);
					String id_Cu = getData(lastRowNum, sheet, j, i);
					String id_Ti = getData(lastRowNum, sheet, j, i);
					String id_Nb = getData(lastRowNum, sheet, j, i);
					String id_V = getData(lastRowNum, sheet, j, i);
					String id_B = getData(lastRowNum, sheet, j, i);
					String id_N = getData(lastRowNum, sheet, j, i);
					String id_Al = getData(lastRowNum, sheet, j, i);
					String id_Ca = getData(lastRowNum, sheet, j, i);
					String id_CePCM = getData(lastRowNum, sheet, j, i);
					String id_CeIIW = getData(lastRowNum, sheet, j, i);
					String id_CeCSA = getData(lastRowNum, sheet, j, i);
					counter++;

					String od_C = getData(lastRowNum, sheet, j, i);
					String od_Si = getData(lastRowNum, sheet, j, i);
					String od_Mn = getData(lastRowNum, sheet, j, i);
					String od_P = getData(lastRowNum, sheet, j, i);
					String od_S = getData(lastRowNum, sheet, j, i);
					String od_Cr = getData(lastRowNum, sheet, j, i);
					String od_Ni = getData(lastRowNum, sheet, j, i);
					String od_Mo = getData(lastRowNum, sheet, j, i);
					String od_Cu = getData(lastRowNum, sheet, j, i);
					String od_Ti = getData(lastRowNum, sheet, j, i);
					String od_Nb = getData(lastRowNum, sheet, j, i);
					String od_V = getData(lastRowNum, sheet, j, i);
					String od_B = getData(lastRowNum, sheet, j, i);
					String od_N = getData(lastRowNum, sheet, j, i);
					String od_Al = getData(lastRowNum, sheet, j, i);
					String od_Ca = getData(lastRowNum, sheet, j, i);
					String od_CePCM = getData(lastRowNum, sheet, j, i);
					String od_CeIIW = getData(lastRowNum, sheet, j, i);
					String od_CeCSA = getData(lastRowNum, sheet, j, i);

					ALPProgram apl = new ALPProgram(project, pqrNum, baseMetal, thickness, diameter, pipeNum, gas,
							flowRate, wire, gmawDiameter, polarity, current, volage, speed, heatInput, idBevelDepth,
							rootFace, odBevelDepth, odBevelAngle, idBevelAngle, idWire1, idWire2, idWire3, t2, t1, l,
							stickOutT2, stickOutT1, stickOutL, T2_T1, T1_L, idDCWireDia, idAC1WireDia, idAC2WireDia,
							idCurrentDCA, idCurrentAC1A, idCurrentAC2A, idVoltageDCV, idVoltageAC1V, idVoltageAC2V,
							idSpeed, idHeatInput, idFlux, odDCWire1, odAC1Wire2, odAC2Wire3, odAC3Wire4, o_t3, o_t2,
							o_t1, o_L, o_stickOutT3, o_stickOutT2, o_stickOutT1, o_stickOutL, o_T3_T2, o_T2_T1, o_T1_L,
							odDCWireDia, odAC1WireDia, odAC2WireDia, odAC3WireDia, odCurrentDCA, odCurrentAC1A,
							odCurrentAC2A, odCurrentAC3A, odVoltageDCV, odVoltageAC1V, odVoltageAC2V, odVoltageAC3V,
							odSpeed, odHeatInput, odFlux, impactTemp, baseReqImpactMin, weldReqImpactMin,
							hazReqImpactMin, baseReqImpactAvg, weldReqImpactAvg, hazReqImpactAvg, baseActualImpact,
							weldActualImpact, hazActualImpact, baseHardnessMax, weldMaxHardness, hazMaxHardness,
							o_baseMinHardness, o_baseMaxHardness, o_hazMinHardness, o_hazMaxHardness, o_weldMinHardness,
							o_weldMaxHardness, twtYS1, twtUTS1, twtElongation1, bow, awtODYS, awtIDYS, awtODUTS,
							awtIDUTS, awtODElongation, awtIDElongation, awtIDYSUTS, awtODYSUTS, id_C, id_Si, id_Mn,
							id_P, id_S, id_Cr, id_Ni, id_Mo, id_Cu, id_Ti, id_Nb, id_V, id_B, id_N, id_Al, id_Ca,
							id_CePCM, id_CeIIW, id_CeCSA, od_C, od_Si, od_Mn, od_P, od_S, od_Cr, od_Ni, od_Mo, od_Cu,
							od_Ti, od_Nb, od_V, od_B, od_N, od_Al, od_Ca, od_CePCM, od_CeIIW, od_CeCSA);
					
					alpList.add(apl);
				}

				LOG.info("Sucessfully processed the file");
				updateDB(alpList);
				dataFile.renameTo(
						new File(dataLoc + "/completed" + "/" + System.currentTimeMillis() + "_" + dataFile.getName()));

			} catch (Exception e) {
				LOG.error("Error while updating the data from excel", e);
				dataFile.renameTo(
						new File(dataLoc + "/error" + "/" + System.currentTimeMillis() + "_" + dataFile.getName()));
			}
		}

	}

	private void updateDB(List<ALPProgram> alpList) {
		try {
			aLPProgramRepository.deleteAllInBatch();
			for(ALPProgram alp : alpList) {
				aLPProgramRepository.saveAndFlush(alp);
			}
			LOG.info("Sucessfully updated the DB");
		}
		catch (Exception e) {
			LOG.error("Error while updating the DB", e);
			throw e;
		}		
	}

	private String getData(int lastRowNum, Sheet sheet, int j, int i) {
		j = j + counter;
		Row row = sheet.getRow(j);
		String data = getValueFromCell(row.getCell(i));
		counter++;
		return data;
	}

	private String getValueFromCell(Cell cell) {
		String cellValue = "";
		if (cell == null) {
			return cellValue;
		}
		try {
			switch (cell.getCellType()) {
			case Cell.CELL_TYPE_FORMULA:
				DecimalFormat df = new DecimalFormat("#.#########");
				cellValue = df.format(cell.getNumericCellValue());
				break;

			case Cell.CELL_TYPE_BOOLEAN:
				cellValue = Boolean.toString(cell.getBooleanCellValue());
				break;

			default:
				DataFormatter formatter = new DataFormatter();
				cellValue = formatter.formatCellValue(cell);
			}
		} catch (IllegalStateException e) {
			LOG.error("Error while readin the excel sheet. Setting Empty value to the column");
			LOG.info("\nColumn index: " + cell.getColumnIndex() + "\n Row Index: " + cell.getRowIndex() + 1);
			LOG.info("Continuing the processing. Please verify the data");

			LOG.debug(e);
		}
		return cellValue;
	}

}
