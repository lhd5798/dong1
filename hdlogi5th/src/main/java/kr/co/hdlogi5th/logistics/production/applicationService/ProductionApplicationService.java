package kr.co.hdlogi5th.logistics.production.applicationService;

import java.util.HashMap;
import java.util.List;

import kr.co.hdlogi5th.logistics.business.to.ContractDetailTO;
import kr.co.hdlogi5th.logistics.production.to.MaterialCheckTempTO;
import kr.co.hdlogi5th.logistics.production.to.MpsTO;
import kr.co.hdlogi5th.logistics.production.to.MrpGatheringTO;
import kr.co.hdlogi5th.logistics.production.to.MrpGatheringTO2;
import kr.co.hdlogi5th.logistics.production.to.MrpOpenTempTO;
import kr.co.hdlogi5th.logistics.production.to.MrpTO;
import kr.co.hdlogi5th.logistics.production.to.PrmTO;
import kr.co.hdlogi5th.logistics.production.to.WorkInstructionTO;
import kr.co.hdlogi5th.logistics.purchase.to.MaterialPaymentTO;
import kr.co.hdlogi5th.logistics.purchase.to.StockTO;
import kr.co.hdlogi5th.logistics.purchase.to.WarehousingTO;


public interface ProductionApplicationService {


	public List<MpsTO> findMpsList(HashMap<String, Object> map);
	
	public void registerMps(List<MpsTO>mpsList, List<ContractDetailTO> contractDetailList);

	public List<MrpTO> findMrpList();

	public List<MrpGatheringTO> findMrpGatheringList();

	public List<WorkInstructionTO> findWorkInstructionList(HashMap<String, Object> map);
	
	public List<MaterialCheckTempTO> findWorkInstructionOpen(HashMap<String, Object> paramMap);
	
	public List<MaterialCheckTempTO> findMaterialCheckTemp();

	public void bathMrpGathering(List<MrpGatheringTO> mrpGatheringList);
	
	public List<MrpGatheringTO> registMrpGathering(HashMap<String, Object> paramMap);

	public void registWorkInstruction(List<WorkInstructionTO> workInstructionList, List<MrpGatheringTO> mrpGatheringList, List<MaterialPaymentTO> materialPaymentList, List<StockTO> stockList);

	public List<PrmTO> findPrmList();

	public void registPrm(List<WorkInstructionTO> workInstructionList, List<PrmTO> prmList, List<StockTO> stockList , List<WarehousingTO> warehousingList);

	public List<MrpOpenTempTO> findMrpOpenTempProcessList(String mpsNo);
	
	public List<MrpOpenTempTO> findMrpOpenTempProcessList(HashMap<String, Object> paramMap);

	public List<MrpGatheringTO2> findMrpGatheringList2(List<MrpTO> mrpList);

}
