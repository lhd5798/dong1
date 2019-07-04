package kr.co.hdlogi5th.logistics.business.dao;

import java.util.List;
import java.util.Map;

import kr.co.hdlogi5th.logistics.business.to.ContractTO;


public interface ContractDAO {

	public List<ContractTO> selectContractList(Map<String,Object> map);

	public void insertContract(ContractTO contractTO);

	public void updateContract(ContractTO contractTO);
	
	public void deleteContract(ContractTO contractTO);
		
}
