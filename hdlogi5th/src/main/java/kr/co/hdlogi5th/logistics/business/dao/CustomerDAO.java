package kr.co.hdlogi5th.logistics.business.dao;

import java.util.List;

import kr.co.hdlogi5th.logistics.business.to.CustomerTO;

public interface CustomerDAO {

	public List<CustomerTO> selectCustomerList();
	
	public void insertCustomer(CustomerTO customerTO);
	
	public void updateCustomer(CustomerTO customerTO);
	
	public void deleteCustomer(CustomerTO customerTO);
	
}
