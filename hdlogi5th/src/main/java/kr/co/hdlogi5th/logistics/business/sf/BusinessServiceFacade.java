package kr.co.hdlogi5th.logistics.business.sf;

import java.util.List;
import java.util.Map;

import kr.co.hdlogi5th.logistics.business.to.ContractDetailTO;
import kr.co.hdlogi5th.logistics.business.to.ContractTO;
import kr.co.hdlogi5th.logistics.business.to.CustomerTO;
import kr.co.hdlogi5th.logistics.business.to.DeliveryResultTO;
import kr.co.hdlogi5th.logistics.business.to.EstimateDetailTO;
import kr.co.hdlogi5th.logistics.business.to.EstimateTO;
import kr.co.hdlogi5th.logistics.purchase.to.StockTO;

public interface BusinessServiceFacade {

	public List<EstimateTO> findEstimateList(Map<String,Object> map);

	public List<EstimateTO> findEstimateDialog();

	public void batchEstimate(List<EstimateTO> estimateList,List<EstimateDetailTO> estimateDetailList);

	public List<EstimateDetailTO> findEstimateDetailList();

	public List<ContractTO> findContractList(Map<String,Object> map);

	public List<ContractDetailTO> findContractDetailList(Map<String,Object> map);
	
	public List<ContractDetailTO> findMpsCheckList(String startDate,String endDate);

	public void batchContract(List<ContractTO> contractList,List<ContractDetailTO> contractDetailList);

	public List<CustomerTO> findCustomerList();

	public List<DeliveryResultTO> findDeliveryResultList();

	public void registDeliveryResult(List<ContractTO> contractList,List<ContractDetailTO> contractDetailList,List<StockTO> stockList, List<DeliveryResultTO> deliveryResultList);

	public void batchCustomer(List<CustomerTO> customerList);
}

