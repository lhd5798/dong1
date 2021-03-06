package kr.co.hdlogi5th.logistics.production.dao;

import java.util.HashMap;
import java.util.List;

import kr.co.hdlogi5th.logistics.production.to.MaterialCheckTempTO;
import kr.co.hdlogi5th.logistics.production.to.WorkInstructionTO;

public interface WorkInstructionDAO {

	public List<WorkInstructionTO> selectWorkInstructionList(HashMap<String, Object> map);
	
	public List<MaterialCheckTempTO> workInstructionOpen(HashMap<String, Object> paramMap);
	
	public List<MaterialCheckTempTO> selectMaterialCheckTemp();

	public void insertWorkInstruction(WorkInstructionTO workInstructionTO);

	public void updateWorkInstruction(WorkInstructionTO workInstructionTO);

	public void deleteWorkInstruction(WorkInstructionTO workInstructionTO);

}
